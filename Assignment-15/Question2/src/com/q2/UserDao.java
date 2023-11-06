package com.q2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class UserDao implements AutoCloseable{
        private Connection con;
	   	private PreparedStatement saveUser;
	   	private PreparedStatement updateUser;
	   	private PreparedStatement deleteUserById;
	   	private PreparedStatement findById;
	   	private PreparedStatement findAllUsers;
	   	
	   	public UserDao() throws Exception {
	   		con = DbUtil.getConnection();
	   		saveUser = con.prepareStatement("INSERT INTO users VALUES(default,?,?,?,?,?,?,?)");
	   		updateUser = con.prepareStatement("UPDATE users SET first_name=? last_name =? email=? password=? dob=? status=? role=? WHERE id = ?");
	   		deleteUserById = con.prepareStatement("DELETE FROM users WHERE id=?");
	   		findById = con.prepareStatement("SELECT * FROM users WHERE id=?");
	   		findAllUsers = con.prepareStatement("SELECT * FROM users");
	   	}

		@Override
		public void close() throws Exception {
			con.close();
			saveUser.close();
			updateUser.close();
			deleteUserById.close();
			findById.close();
			findAllUsers.close();
		}
	   	
	   	public int save(User u) throws SQLException, ParseException {
	   		saveUser.setString(1,u.getFirst_name());
	   		saveUser.setString(2,u.getLast_name());
	   		saveUser.setString(3,u.getEmail());
	   		saveUser.setString(4,u.getPassword());
	   		
	   		String date = u.getDob();
	   		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
	   		java.util.Date uDate = sdf.parse(date);
	   		java.sql.Date sDate = new java.sql.Date(uDate.getTime()); 
	   		saveUser.setDate(5,sDate);
	   		saveUser.setBoolean(6,u.isStatus());
	   		saveUser.setString(7,u.getRole());	   		
	   		int result = saveUser.executeUpdate();
	   		return result;
	   	}
	   	
	   	public int update(User u) throws SQLException, ParseException {
	   		updateUser.setString(1,u.getFirst_name());
	   		updateUser.setString(2,u.getLast_name());
	   		updateUser.setString(3,u.getEmail());
	   		updateUser.setString(4,u.getPassword());
	   		String date = u.getDob();
	   		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
	   		java.util.Date uDate = sdf.parse(date);
	   		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
	   		
	   		updateUser.setDate(5,sDate);
	   		updateUser.setBoolean(6,u.isStatus());
	   		updateUser.setString(7,u.getRole());	   		
	   		int result = updateUser.executeUpdate();
	   		return result;
	   	}
	   	
	   	public int deleteUser(int id) throws SQLException {
	   		deleteUserById.setInt(1, id);
	   		int result = deleteUserById.executeUpdate();
			return result;	
	   	}
	   	
	   	public User findUser(int id) throws SQLException, ParseException {
	   		findById.setInt(1, id);
	   		try(ResultSet rs = findById.executeQuery()){
	   			if(rs.next()) {
	   				java.sql.Date sDate = rs.getDate("dob");
	   				SimpleDateFormat sdf  = new SimpleDateFormat("dd-mm-yyyy");
	   				String date =sdf.format(sDate);
	   				return new User(rs.getInt(id),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"),rs.getString("password"),date,rs.getBoolean("status"),rs.getString("role"));
	   			}
	   			return null;
	   		}
	   		
	   	}
		public List<User> findUsers() throws SQLException, ParseException {
	   		List<User> list = new ArrayList<User>();
			try(ResultSet rs = findAllUsers.executeQuery()){
	   			while(rs.next()) {
	   				int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date dob = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
					String uDate =sdf.format(dob);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User c = new User(id,fname,lname,email,password,uDate,status,role);
					list.add(c);
	   			}
	   		}
			return list;
	   	}
}
