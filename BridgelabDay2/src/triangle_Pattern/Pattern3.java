package triangle_Pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int num = 1,temp = 1,temp1 = 4;
		for (int i = 1; i <= 4; i++) {
		
			if(i%2 == 0) {
			
				for(int j = 1; j <= num; j++) {
					
					if(j%2 == 0) {
						System.out.print("*");
					}else {						
						System.out.print(temp1);
						temp1++;
						
					}
				
				}
				num -= 2;
			}else{
				
				for(int j = 1; j <= num; j++) {
				
					if(j%2 == 0) {
						System.out.print("*");
					}else {
						System.out.print(temp);
						temp++;
					}
					
				}
				num += 4;
			}
			System.out.println();
		}
	}
}

/***

1
4*5*6
2*3
7*8*9*10


*/