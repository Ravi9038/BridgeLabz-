
public class Double_Increment_Diamond {
	
	public static void main(String[] args) {
		
		int num = 3,num1 = 7;
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= 4; j++) {

				if(i>=j && i+j <= 8) {
					
					if(i<=4) {
						
						System.out.print(num);
						num++;
					}else {
						System.out.print(num);
						num++;
					}
					
				}else {
					
					System.out.print(" ");
				}
				
			}
			if(i >= 4) {
				num = num - num1;
				num1 -=2;
			}
				System.out.println();
		}
	}
}

/**


3   
45  
678 
9101112
678 
45  
3   


*/
