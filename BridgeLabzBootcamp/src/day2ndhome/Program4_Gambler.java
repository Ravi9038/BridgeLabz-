package day2ndhome;

public class Program4_Gambler {

	public static void main(String[] args) {
		
		int stake = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trails = Integer.parseInt(args[2]);
		
		int wins = 0;
		int bets = 0;
		
		for (int i = 0; i < trails; i++) {
			
			int cash = stake;
			
			while (cash > 0 && cash < goal) {
			
				bets++;
				if(Math.random() < 0.5)
					cash++;
				else
					cash--;				
			}
			
			if(cash == goal)
				wins++;
		}
		
		System.out.println(wins + " Wins Of "+ trails);
		System.out.println("Percentages of games won = "+100.0 * wins / trails);
		System.out.println("Avg // bets = "+1.0 * bets / trails);
	}
}

/**

201 Wins Of 1000
Percentages of games won = 20.1
Avg // bets = 9878.158

*/