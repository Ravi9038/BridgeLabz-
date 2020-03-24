package Basic_Square_number;

public class Pattern5_Basic_Square {
	
	public static void main(String[] args) {
		int temp = 0,temp2 = 0;
		for (int i = 1; i <= 5; i++) {
			int num = i;
			for (int j = 1; j <= 7; j++) {
				
				if(j%2 == 0) {
					System.out.print("*");
				}else {
					
					if (i == 1 || i == 5 ) {
						System.out.print(num);
						num++;
						temp = num+4;
					}else if (i == 2 || i ==4) {
						
						System.out.print(temp);
						temp++;
						temp2 = temp + 4;
					}else {
						System.out.print(temp2);
						temp2++;
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
17*18*19*20
13*14*15*16
5*6*7*8


*/
