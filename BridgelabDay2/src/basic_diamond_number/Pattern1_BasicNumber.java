package basic_diamond_number;

public class Pattern1_BasicNumber {
	
	public static void main(String[] args) {
		int num = 14, var = 1,temp = 0;
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= 7; j++) {
			
				
				if(j < 2*i && i+j<= num) {
					
					if(j%2 == 0) {
						
						System.out.print("*");
						
					}else if(i<=4){	
						
						System.out.print(var);
						
					}else {
						System.out.print(temp);
					}
				}else {
					
					System.out.print(" ");
				}
			}
			num--;
			if(i<=4) {
				
				var++;
				temp = var-2;
				
			}else {
				
				temp--;
			}
			System.out.println();
		}
	}
}
/**
 * 

1      
2*2    
3*3*3  
4*4*4*4
3*3*3  
2*2    
1      


*/


