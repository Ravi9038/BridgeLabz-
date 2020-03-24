
public class Inver_Half_Star {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= 4; j++) {
				
				if(i+j < 5 || i-j >=4) {
					
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}

/**

   *
  **
 ***
****
 ***
  **
   *

*/
