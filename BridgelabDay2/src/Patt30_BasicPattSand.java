
public class Patt30_BasicPattSand {

	public static void main(String[] args) {
		
		int num = 2, var = 2, temp = 0;
		
		for (int i = 1; i <= 8; i++) {
			
			int num1 = num;
			
			for (int j = 1; j <= 4; j++) {
				
				if(i >= j && i+j <= 9) {
					
					if(i<=4) {
					
						System.out.print(num1);
						num1--;
						temp = num1 + 4;
						
					}else {
						System.out.print(temp);
						temp--;
					}
				}else {
					
					System.out.print(" ");
				}
			}
			
			if(i <= 4) {
				
				num += var;
				var++;
				
			}
			System.out.println();
		}
	}
}


/*

2   
43  
765 
111098
111098
765 
43  
2   


*/
