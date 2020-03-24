package Basic_Square_number;

public class Pattern6_Mirror_Square {

	public static void main(String[] args) {
		int num = 4;
		for (int i = 1; i <= 4; i++) {
			int num1 = num;
			for (int j = 0; j <= 6; j++) {
				
				if (j%2 != 0) {
					
					System.out.print("*");
				}else {
					
					System.out.print(num1);
					num1--;
				}
			}
			if(i%2 == 0) 
				num -= 4;
			else
				num += 8;
			System.out.println();	
		}
	}
}

/**

4*3*2*1
12*11*10*9
8*7*6*5
16*15*14*13


*/