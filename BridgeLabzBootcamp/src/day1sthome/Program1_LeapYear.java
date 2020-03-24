package day1sthome;
import java.io.*;

public class Program1_LeapYear {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Year");
		
		int year = Integer.parseInt(br.readLine());
		
		while(year < 1582) {
			
			System.out.println("Enter the year is greater than 1582");
			year = Integer.parseInt(br.readLine());
		}
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			
			System.out.println("Year is Leap Year = "+year);
		}else {
			
			System.out.println("Year is not Leap year");
			
		}
		
	}
}
