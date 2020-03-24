
public class Incre3_Patt {

	public static void main(String[] args) {
		
		int num = 6;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 4; j >= i ; j--) {
				
				System.out.print(num);
				
			}
			num--;
			System.out.println();
		}
	}
}

/**
 
 
6666
555
44
3

*/
