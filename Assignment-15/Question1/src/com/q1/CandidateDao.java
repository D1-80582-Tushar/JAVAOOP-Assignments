package com.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CandidateDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement saveCandidate;
	private PreparedStatement updateCandidate;
	private PreparedStatement deleteCandidateById;
	private PreparedStatement findById;
	private PreparedStatement findAll;
	private PreparedStatement findByParty;

	
	public CandidateDao() throws Exception {
		con = DbUtil.getConnection();
		saveCandidate = con.prepareStatement("INSERT INTO candidates VALUES(default,?,?,?)");
		updateCandidate = con.prepareStatement("UPDATE candidates SET name=?, party=?, votes=? WHERE id=?");
		deleteCandidateById = con.prepareStatement("DELETE FROM candidates WHERE id=?");
		findById = con.prepareStatement("SELECT FROM candidates WHERE id=?");
		findAll = con.prepareStatement("SELECT * FROM candidates");
		findByParty = con.prepareStatement("SELECT * FROM candidates WHERE party=?");
	}
	
	public void close() {
		try {
			if (con != null)
				con.close();
			    saveCandidate.close();
			    updateCandidate.close();
			    deleteCandidateById.close();
			    findById.close();
			    findAll.close();
			    findByParty.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws Exception {
		saveCandidate.setString(1, c.getName());
		saveCandidate.setString(2,c.getParty());
		saveCandidate.setInt(3, c.getVotes());
		int res = saveCandidate.executeUpdate();
		return res;
	}
	
	public int update(Candidate c) throws Exception {
			updateCandidate.setString(1, c.getName());
			updateCandidate.setString(2, c.getParty());
			updateCandidate.setInt(3, c.getVotes());
			updateCandidate.setInt(4, c.getId());
			int count = updateCandidate.executeUpdate();
			return count;
	}
	
	public int deleteById(int id) throws SQLException {
		deleteCandidateById.setInt(1, id);
		int res = deleteCandidateById.executeUpdate();
		return res;
	}
	
	public Candidate findById(int id) throws SQLException {
		findById.setInt(1, id);
		ResultSet res = findById.executeQuery();
		if(res.next()) {
			return new Candidate(res.getInt("id"),res.getString("name"),res.getString("party"),res.getInt("votes"));
		}
		return null;
	}
	
	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<Candidate>();
		ResultSet rs = findAll.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String party = rs.getString("party");
			int votes = rs.getInt("votes");
			list.add(new Candidate(id,name,party,votes));
		}
		return list;
	}
	
	public List<Candidate> findByParty(String party) throws Exception {
		List<Candidate> list = new ArrayList<Candidate>();
		findByParty.setString(1, party);
			try(ResultSet rs = findByParty.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		return list;
	}
}
