package day2ndhome;

public class Program2_Sqrt {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number ");
		double c = Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		double t = c;
		
		while(Math.abs(t - c/t) > epsilon*t) {
			
			t = (c/t + t) / 2.0;
		}
		
		System.out.println("Sqrt of Non Negative number of c = "+t);
	}
	
}

/**

Enter the Number 2
Sqrt of Non Negative number of c = 1.414213562373095
Enter the Number 10 
Sqrt of Non Negative number of c = 3.162277660168379

*/