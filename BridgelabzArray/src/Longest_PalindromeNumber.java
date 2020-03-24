
import java.io.*;

public class Longest_PalindromeNumber {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size of Array");
		int num = Integer.parseInt(br.readLine());
	
		int arr[] = new int[num];
		
		System.out.println("Enter the Element in Array");
		
		for (int i = 0; i < num; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}			
		}
		
		
		int temp = 0;
		 
		for (int i = 0; i < arr.length; i++) {
					
			int rem = 0, number = arr[i],reverse = 0;;
			
			while(number != 0) {
				
				rem = number % 10;
				reverse = reverse * 10 + rem;
				number = number / 10;
			}
			
			if(arr[i] == reverse) {
				temp = arr[i];
				break;
			}
		}
		
		System.out.println("Greatest Palindrome Number : "+temp);
	}
	
}

/**
 
 Enter the Size of Array
5
Enter the Element in Array
121
415
54545
154
212
Greatest Palindrome Number : 54545

*/
 
