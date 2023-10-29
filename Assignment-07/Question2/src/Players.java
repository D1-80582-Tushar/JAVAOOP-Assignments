
public class Players {
	   public static int batterTotalRuns(Player[] arr) {
			int runs = 0;
			for(Player p:arr) {
			if(p instanceof Batter) {
			Batter b = (Batter)p;
			runs = runs + b.getRuns();
			}
			}
			return runs;
		}
	   
		public static int bowlerTotalWickets(Player[] arr) {
            int wickets = 0;
            for(Player p:arr) {
            	if(p instanceof Bowler) {
            		Bowler b = (Bowler) p;
            		wickets += wickets +b.getWickets();
            	}
            }
			return wickets;
		}
		
		public static int countBatters(Player[] arr) {
			int batters = 0;
			for(Player p:arr) {
				if(p instanceof Batter) {
					 batters++;
				}
			}
			return 0;
		}
		
		public static int countBowlers(Player[] arr) {
			return 0;
		}
		
		public static Player maxRunBatter(Player[] arr) {
			return null;
		
		}
		
		public static Player maxWicketBowler(Player[] arr) {
			return null;
			
		}
}
