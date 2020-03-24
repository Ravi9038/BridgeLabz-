package Basic_Square_number;

public class Patt1_Basic_Incre_square {

	public static void main(String[] args) {
		
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= 7; j++) {
				
				if(j % 2 != 0) {
				
					System.out.print(num);
					num++;
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

/**
 
 
1*2*3*4
5*6*7*8
9*10*11*12
13*14*15*16


*/
