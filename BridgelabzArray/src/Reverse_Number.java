import java.io.*;

public class Reverse_Number {

	public static void main(String[] args)  throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array : ");
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		
		System.out.println("Enter the Number in the array");
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
				
		for(int j = 0;j < num;j++) {
			
			int temp = arr[j];
			arr[j] = arr[num-1];
			arr[num-1] = temp;
		}
		
		System.out.println("Reverse Number array 3");
		for (int j2 = 0; j2 < num; j2++) {
			
			System.out.println(arr[j2]);
		}
	}
}

/**

Enter the size of array : 
3
Enter the Number in the array
4
5
6
Reverse Number array 
6
4
5

*/
