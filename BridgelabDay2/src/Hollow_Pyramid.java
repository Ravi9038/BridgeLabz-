
public class Hollow_Pyramid {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 3; j >= i; j--) {
				
				System.out.print(" ");
			}
			
			for (int k = 0; k <= 2*i; k++) {
				
				if(i == 0 || k == 0 || i == 3 || k == (2*i)){
				
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		
			System.out.println();
		}
	}
}

/**
 * 

    *
   * *
  *   *
 *******

*/
