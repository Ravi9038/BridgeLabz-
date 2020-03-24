import java.io.*;

public class SumOfTwoPrime {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Number : ");
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		
		for (int i = 1; i < num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 0) {
			
				arr[i] = i;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			int sum = 0;
			
			for (int j = 1; j < arr.length; j++) {
				
				 sum = arr[i] + arr[j];		
			
				if(sum == num) {
					
					System.out.println("Pair of Prime Number : "+ i + " : " + j + " = "+sum );				
					break;
				}
			}
		}
	}
}
