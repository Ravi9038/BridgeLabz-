
public class demo {

	public static void main(String[] args) {
		
		int num1 = 0,num2 = 1,sum = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(num1);
			sum = num1+num2;
			num1 = num2;			
			num2 = sum;
			
		}
	}
}
