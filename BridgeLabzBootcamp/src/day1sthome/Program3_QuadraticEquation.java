package day1sthome;

/**
 * 
 * @author ravi
 *

3. Write a program ​ Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.
 
 *
 */

public class Program3_QuadraticEquation {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		double delta = b*b - 4*a*c;
		
		double root1 = ((-b + Math.sqrt(delta))/2*a);
		double root2 = ((-b - Math.sqrt(delta))/2*a);
		
		System.out.println("Root1 is = "+root1 + " : "+ "Root2 = "+root2);
		
	}
}


/**

Root1 is = -0.5857864376269049 : Root2 = -3.414213562373095
Root1 is = NaN : Root2 = NaN
Root1 is = -2.0 : Root2 = -3.0


*/