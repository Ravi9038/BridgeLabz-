
public class Internal_varsi_Patt {

	public static void main(String[] args) {
		
		int num = 3,num1 = 1;
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= 3; j++) {
				
				if(i==1 || i == 4 || j == 1 || j == 3) {
					
					System.out.print(num);
				}else {
					
					System.out.print(num1);
					num1++;
				}
			}
			;
			System.out.println();
		}
	}
}

/**

333
313
323
333


*/
