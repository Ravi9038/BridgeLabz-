package intersectarray;

import java.io.*;

public class IntersectElement {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of Array1");
		int arrLimt1 = Integer.parseInt(br.readLine());
	
		System.out.println("Enter the size of Array2");
		int arrLimt2 = Integer.parseInt(br.readLine());
	
		int arr1[] = new int[arrLimt1];
		int arr2[] = new int[arrLimt2];
		
		System.out.println("Enter the Element in the first Array1");
		
		for (int i = 0; i < arr1.length; i++) {
			
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter the Element in the Second Array2");
		
		for (int j = 0; j < arr2.length; j++) {
			
			arr2[j] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Intersect Elements :");
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = i; j < arr2.length; j++) {
				
				if(arr1[i] == arr2[j]) {
					
					System.out.print(arr1[i]+ " ");			
					break;
				}
			}			
		}
		
		System.out.println();
	}
}

/**
 * 
 * Enter the size of Array1
5
Enter the size of Array2
6
Enter the Element in the first Array2
1
2
3
4
5
Enter the Element in the Second Array2
6
8
52
1
2
3
Intersect Elements :
1 2 3 
*/
