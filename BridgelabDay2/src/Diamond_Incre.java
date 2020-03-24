
public class Diamond_Incre {
	
	public static void main(String[] args) {
		
		int num = 3;
		for (int i = 1; i <= 7; i++) {
					
			for (int j = 1; j <= 4; j++) {

				if(i>=j && i+j <= 8) {
					
					System.out.print(num);
									
				}else {
					System.out.print(" ");
				}
			}
			
			if(i>3) {
				
				num--;
				
			}else {
				num++;
			}
			System.out.println();
		}
	}
}


/**

3   
44  
555 
6666
555 
44  
3   


*/
