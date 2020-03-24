package triangle_Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int num = 1,num2 = 2;
		for (int i = 1; i <= 4; i++) {
			int num1 = num;
			for (int j = 1; j < 2*i; j++) {
				
				if (j%2 == 0) {
					
					System.out.print("*");
				}else {
					System.out.print(num1);
					num1--;
				}
			}
			num = num + num2;
			num2++;
			
			System.out.println();
		}
	}
}

/**

1
3*2
6*5*4
10*9*8*7

*/