
public class Basic_Incre3_Patt {

	public static void main(String[] args) {
		
		int num = 3;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(num);
			}
			num++;
			System.out.println();
		}
	}
}

/**

3
44
555
6666


*/