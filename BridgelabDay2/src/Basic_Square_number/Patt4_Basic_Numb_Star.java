package Basic_Square_number;

public class Patt4_Basic_Numb_Star {

	public static void main(String[] args) {
		int num1 = 1, num2 = 9;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= 7; j++) {
				
				if(j%2 == 0) {
					
					System.out.print("*");		
					
				}else {
					
					if (i == 1 || i == 4) {
						
						System.out.print(num1);
						num1++;
						
					}else {
						
						System.out.print(num2);
						num2++;
					}	
				}
			}
			System.out.println();
		}
	}
}

/**


1*2*3*4
9*10*11*12
13*14*15*16
5*6*7*8

*/
