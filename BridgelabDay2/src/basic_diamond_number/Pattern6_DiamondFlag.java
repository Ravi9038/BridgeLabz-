package basic_diamond_number;

public class Pattern6_DiamondFlag {
	
	public static void main(String[] args) {
		int num = 8,var1 = 6,temp = 6,var = 0;
		for (int i = 1; i <= 8; i++) {
			
			for (int j = 1; j <= 7; j++) {
				
				if(i+j <= num) {
					
					if(j%2 != 0) { 
						System.out.print(temp);
						
					}else 
						System.out.print("*");
					
				}else if(i>4){
					
					if(i+j <= var1)	
						if(j%2 != 0)
							System.out.print(var);
						else
							System.out.print("*");
				}
				
			}
			num--;
			if(i<=4) {
				temp--;
				var = temp + 1;
			}
			else
				var++;
				
			if(i>4)
				var1 += 3;
			
			System.out.println();
		}
	}
}


/**
 * 

6*6*6*6
5*5*5
4*4
3
3
4*4
5*5*5
6*6*6*6


*/
