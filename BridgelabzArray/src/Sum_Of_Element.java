import java.io.*;

public class Sum_Of_Element {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size Of Array");
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		int sum = 0;
		
		System.out.println("Enter the Element in the Array");
		
		for (int i = 0; i < num; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}
		System.out.println("sum Of Elements = "+sum);
	}
}

/**
 * Enter the Size Of Array
5
Enter the Element in the Array
1
2
3
4
5
sum Of Elements = 15
*/
