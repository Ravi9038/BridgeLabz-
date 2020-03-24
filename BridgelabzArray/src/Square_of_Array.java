import java.io.*;

public class Square_of_Array {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size Of array");
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		int sum = 0;
		System.out.println("Enter the Element in the Array");
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + (arr[i]*arr[i]);
		}
		
		System.out.println("Square of Array "+sum);
		
	}
}


/**
 
 Enter the Size Of array
3
Enter the Element in the Array
1
2
3
Square of Array 14

*/
