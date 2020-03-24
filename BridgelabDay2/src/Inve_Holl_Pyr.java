
public class Inve_Holl_Pyr {

	public static void main(String[] args) {
		
		int num = 4;
		for (int i = 1; i <= 4 ; i++) {
			
			for (int j = 1; j < i; j++) {
				
				System.out.print(" ");
			}
			for (int j = 9; j > i*2; j--) {
				
				if(i == 1 || i == 4 || j == 9 || (i+j == num) ) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
	
			}
			num += 3;
			System.out.println();
		}	
	}
}


/**

*******
 *   *
  * *
   *

*/