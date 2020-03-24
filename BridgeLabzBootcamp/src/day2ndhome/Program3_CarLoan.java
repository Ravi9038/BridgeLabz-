package day2ndhome;

public class Program3_CarLoan {

	public static void main(String[] args) {
		
		System.out.println("Enter The Principal Loan, Year, Interest Rate ");
		double princiLoan = Double.parseDouble(args[0]);
		double year = Double.parseDouble(args[1]);		
		double  rate = Double.parseDouble(args[2]);

		double r = rate / (12 * 100);
		double n = 12 * year;
		
		double payment = (princiLoan * r ) / (1-Math.pow(1 + r, -n));
		double interest = payment * n - princiLoan;
		
		System.out.println("Monthly Payment = "+payment);
		System.out.println("Total Interest = "+interest);
			
	}
}

/**

Enter The Principal Loan, Year, Interest Rate 40000 5 12
Monthly Payment = 889.7779073960704
Total Interest = 13386.674443764226

Enter The Principal Loan, Year, Interest Rate 3000 3 6
Monthly Payment = 91.26581235466712
Total Interest = 285.56924476801623

 */

