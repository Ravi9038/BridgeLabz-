
public class Patt29_DubleIcre3 {
	
	public static void main(String[] args) {
		
		int num = 2, temp = 0, var = 3;
		for (int i = 1; i <= 8; i++) {
		
			int temp1 = temp;
			for (int j = 1; j <=  4; j++) {
				
				if(i >= j && i+j <=9) {
					if(i<=4) {
						System.out.print(num);
						num++;
						temp = num - 4;
					}else {
						System.out.print(temp1);
						temp1++;
					}
				}else {
			
					System.out.print(" ");
				}
			}
			
			if(i >= 5) {
				temp -= var;
				var--;
			}
			System.out.println();
		}
	}
}


/**
 * 

2   
34  
567 
891011
891011
567 
34  
2   

*/