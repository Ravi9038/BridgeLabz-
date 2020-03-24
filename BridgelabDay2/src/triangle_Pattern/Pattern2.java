package triangle_Pattern;

public class Pattern2 {
	
	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 9; j > i*2; j--) {
				
				if(j%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(num);
					num--;
				}
			}
			System.out.println();
		}
	}

}

/**


10*9*8*7
6*5*4
3*2
1

*/
