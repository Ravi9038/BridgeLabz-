package day1sthome;

public class Program4_EuclidineDistance {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		
		if(num1 == 0 && num2 == 0){
		
			System.out.println("Eucliden distance form is center ");
		}else {
			
			double var1 = Math.pow(num1,2);
			double var2 = Math.pow(num2,2);
			
			System.out.println("Euclidine Distance = "+Math.sqrt(var1 + var2));
			
		}
	}
}

/**

Euclidine Distance = 5.385164807134504

*/