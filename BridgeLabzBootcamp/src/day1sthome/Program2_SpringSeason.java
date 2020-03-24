package day1sthome;


public class Program2_SpringSeason {

	public static void main(String[] args) {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Month and Date");
		
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);	
		
		System.out.println("Month = "+month);
		System.out.println("Day = "+day);
		
		if((month == 3 && day >= 20 && day <=31) || (month == 4 && day >= 1 && day <=30) || (month == 5 && day >= 1 && day <= 31)
				||(month == 6 && day >=1 && day<= 21) ) {
			
			System.out.println("This Season is Spring Season Month = " + month+" : " +"Day = "+day );
		}else {
			System.out.println("This Season is not Spring Season Month = " + month+" : " +"Day = "+day );
		}
	}	

}

/**
 * 
Enter the Month and Date
Month = 6	/**
	 * 
Enter the Month and Date
Month = 6
Day = 22
This Season is not Spring Season Month = 6 : Day = 22

Enter the Month and Date
Month = 3
Day = 31
This Season is Spring Season Month = 3 : Day = 31


 */
