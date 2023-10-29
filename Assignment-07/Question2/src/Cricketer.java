
public class Cricketer extends Player implements Batter,Bowler {
    private int runs;
    private int wickets;

    public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets) {
    	super(id, name, age, matchesPlayed);
    	this.runs = runs;
    	this.wickets = wickets;
    }
	
    @Override
	public int getWickets() {
		// TODO Auto-generated method stub
		return wickets;
	}
	@Override
	public double getEconomy() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;
	}
	@Override
	public double getAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getStrikeRate() {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
}
