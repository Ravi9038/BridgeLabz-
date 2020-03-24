
public class Basic_incrementing_Trangle_Patt {

	public static void main(String[] args) {
		
		int num = 3,num2 = 2,temp = 0;
		for (int i = 1; i <= 7; i++) {
			int num1 = num;
			for (int j = 1; j <= 4; j++) {
				
				if(i>=j && i+j <= 8 ) {
					if(i<=4) {
						System.out.print(num1);
						num1--;
						temp = num1;
					}else {
						System.out.print(temp);
						temp--;
					}
					
				}else {
					System.out.print(" ");
				}
			}
			if(i<=4) {
				num = num + num2;
				num2++;
			}
			System.out.println();
		}
	}
}

/**

3   
54  
876 
1211109
876 
54  
3   

*/

