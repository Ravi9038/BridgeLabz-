import java.io.*;

public class Max_Elem_Array {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array");
		
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		
		System.out.println("Enter Element in array");
		
		for (int i = 0; i < num; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		int max = arr[0];
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num; j++) {
				
				if(arr[j] > arr[i]) {
					
					max = arr[j];
				}
			}			
		}
		
		System.out.println("MAx Element in Array = "+max);
	}
}

/**
 * 

Enter the size of array
3
Enter Element in array
56
85
55
MAx Element in Array = 85


*/
