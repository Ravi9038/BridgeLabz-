package basic_diamond_number;

public class Pattern3_FlagDiamond {

	public static void main(String[] args) {
		int num = 8,var1 = 6,temp = 4,var = 0;
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
 
 
4*4*4*4
3*3*3
2*2
1
1
2*2
3*3*3
4*4*4*4

*/
