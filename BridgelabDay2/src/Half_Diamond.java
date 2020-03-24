
public class Half_Diamond {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= 4; j++) {
				
				if (i >= j && i+j <= 8) {
					
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
				
				//System.out.print("*");
			}
			System.out.println();
		}
	}
}
/**

*   
**  
*** 
****
*** 
**  
*   


*/