
public class Patt28_IncreInverte3 {

	public static void main(String[] args) {
		int num = 2, temp = 0;
		for (int i = 1; i <=8 ; i++) {
			
			for (int j = 1; j <= 4; j++) {
				
				if(i>=j && i+ j <= 9) {
					if(i<=4)					
						System.out.print(num);
					else
						System.out.print(temp);
				}else {
					
					System.out.print(" ");
				}
			}
			
			if(i<=4) {
				num++;
				temp = num - 1;
			}else {
				temp--;
			}
			System.out.println();
		}
	}
}

/**
 * 
2   
33  
444 
5555
5555
444 
33  
2   
*/
