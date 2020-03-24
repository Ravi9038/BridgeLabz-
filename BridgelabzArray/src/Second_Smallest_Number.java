import java.io.*;

public class Second_Smallest_Number {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size of Array : ");
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		
		System.out.println("Enter the Element in the Array");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}				
			}
		}
		System.out.println("Second Smallest Min = " + arr[1]);
	}
}

/**
 * Enter the Size of Array : 
5
Enter the Element in the Array
6
3
2
1
2
Second Smallest Min = 2
*/
