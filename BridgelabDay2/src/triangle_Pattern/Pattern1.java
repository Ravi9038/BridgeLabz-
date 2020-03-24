package triangle_Pattern;

public class Pattern1 {

	public static void main(String[] args) {
	
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			
			for(int j=1;j<2*i;j++) {
				
				if(j%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
		}
	}
}

/**

1
2*3
4*5*6
7*8*9*10

*/
