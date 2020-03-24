package Basic_Square_number;

public class Patt2_Basic_Inverted_Square {

	public static void main(String[] args) {
		int num = 13;
		for (int i = 1; i <= 4; i++) {
			int num1 = num;
			for (int j = 1; j <= 7; j++) {
				
				if (j%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(num1);
					num1++;
				}
			}
			num -= 4;
			System.out.println();
			
		}
	}
}

/**

13*14*15*16
9*10*11*12
5*6*7*8
1*2*3*4


*/
