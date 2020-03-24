
import java.io.*;

public class Min_Element_Array {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size of Array");
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		
		System.out.println("Enter the Elements in the Array");
		
		for (int i = 0; i < num; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		int min = arr[0];
		
		for (int i = 0; i < num; i++) {
		
			for (int j = 0; j < num; j++) {
				
				if(arr[j] < arr[i]) {
					
					min = arr[j];
				}
			}
		}
		
		System.out.println("Minimum Element in the Array = "+min);
				
	}
}

/**
 * 

Enter the Size of Array
5
Enter the Elements in the Array
4
5
3
2
6
Minimum Element in the Array = 2

*/
