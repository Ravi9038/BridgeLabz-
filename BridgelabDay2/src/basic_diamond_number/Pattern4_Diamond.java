package basic_diamond_number;

public class Pattern4_Diamond {

	public static void main(String[] args) {
		int num = 10, var = 2,temp = 0;
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
			
				
				if(j < 2*i && i+j<= num) {
					
					if(j%2 == 0) {
						
						System.out.print("*");
						
					}else if(i<=3){	
						
						System.out.print(var);
						
					}else {
						System.out.print(temp);
					}
				}else {
					
					System.out.print(" ");
				}
			}
			num--;
			if(i<=3) {
				
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
 
 
2    
3*3  
4*4*4
3*3  
2    

*/
