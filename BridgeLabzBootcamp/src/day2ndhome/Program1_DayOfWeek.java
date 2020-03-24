package day2ndhome;

public class Program1_DayOfWeek {

	public static void main(String[] args) {
		
		System.out.println("Enter the Month, Day, Year");
		
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		int year0 = year - (14 - month)/12;
		int x = year0 + year0/4 - year0/100 + year0/400;
		int m0 = month + 12 * ((14-month) / 12) - 2;
		int d0 = (day + x + 31*m0/12) % 7 ;
	
		if(d0 == 0) {
			
			System.out.println("Day is Sunday");
			
		}else if(d0 == 1) {
			
			System.out.println("Day is Monday");
		}else if(d0 == 2) {
			
			System.out.println("Day is Tuesday");
		}else if(d0 == 3) {
			
			System.out.println("Day is Wednsday");
		}else if(d0 == 4) {
		
			System.out.println("Day is Thursday");
		}else if(d0 == 5) {
			
			System.out.println("Day is Friday");
		}else {
			System.out.println("Day is Saturday");
		}
	}
}
/**
 * 
Enter the Month, Day, Year 6 13 1993
Day is Sunday

Enter the Month, Day, Year 10 1 2008
Day is Thursday

Enter the Month, Day, Year 9  6 2008
Day is Monday


*/

