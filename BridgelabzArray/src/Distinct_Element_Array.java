import java.io.*;

public class Distinct_Element_Array {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Array size : ");
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		int i,k;
		System.out.println("Enter the Element in the Array");
		
		for (i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
 			
		}
		
		System.out.print("Distinct Number : ");
		for (i = 0; i < arr.length; i++) {
			
			for (k = 0; k < arr.length; k++) {
			
				if(arr[i] == arr[k])
					break;
			}
			
			if(i == k)
				System.out.print(arr[i]+ " ,");
			
		}
		System.out.println();
 	}
	
}

/**
 * Enter the Array size : 
8
Enter the Element in the Array
1
22
22
3
4
4
5
6
Distinct Number : 1 ,22 ,3 ,4 ,5 ,6 ,
*/
