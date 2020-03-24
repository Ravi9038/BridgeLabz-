
public class Decre_Trangle {

	public static void main(String[] args) {
			
		int num = 10;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 4; j >= i; j--) {
				
				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}
}


/**

10987
654
32
1


*/