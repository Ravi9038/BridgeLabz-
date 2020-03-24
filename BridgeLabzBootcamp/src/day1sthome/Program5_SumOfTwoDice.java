package day1sthome;

/**
 * 
 * @author ravi
 *	Sum of Two dice 
 */
public class Program5_SumOfTwoDice {

	public static void main(String[] args) {
		
		int dieSide = 6,sum = 0;;
		int dice1 = (int)(Math.random() * dieSide) + 1;
		int dice2 = (int)(Math.random() * dieSide) + 1;
		sum = dice1 + dice2;
		
		System.out.println("Sum Of TWo Dice = "+ sum);
	}
}


/**

Sum Of TWo Dice = 4
Sum Of TWo Dice = 12
Sum Of TWo Dice = 4
Sum Of TWo Dice = 9


*/