
public class Inverted_pyramid {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 9; j > i*2; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/**

*******
 *****
  ***
   *

*/