package union;

import java.io.*;
import java.util.Arrays;

public class UnionElement {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of Array1 :");
		int num = Integer.parseInt(br.readLine());
	
		System.out.println("Enter the size of second Array2 :");
		int num1 = Integer.parseInt(br.readLine());
		
		int arr1[] = new int[num];
		int arr2[] = new int[num1];
		int arr3[] = new int[num];
		
		System.out.println("Enter the Element in the first Array");
		
		for (int i = 0; i < arr1.length; i++) {
			
			arr1[i] = Integer.parseInt(br.readLine());
			arr3[i] = arr1[i];
		}
		System.out.println("Enter the Element in the second Array ");
		
		for (int j = 0; j < arr2.length; j++) {
			
			arr2[j] = Integer.parseInt(br.readLine());
			arr3 = Arrays.copyOf(arr3, arr3.length + 1);
			arr3[arr3.length - 1] = arr2[j];
		}
		
		System.out.println("Union of the Array");
		
		int j;
		for (int i = 0; i < arr3.length; i++) {
			
			for (j = 0; j < arr3.length; j++) {
				
				if(arr3[i] == arr3[j])
					break;						
			}
			
			if(i == j)
				System.out.print(arr3[i]+ " ");
		}
		
		System.out.println();
		
	}
}


/**

Enter the size of Array1 :
5
Enter the size of second Array2 :
5
Enter the Element in the first Array
1
2
3
4
5
Enter the Element in the second Array 
6
7
8
9
1
Union of the Array
1 2 3 4 5 6 7 8 9 


*/