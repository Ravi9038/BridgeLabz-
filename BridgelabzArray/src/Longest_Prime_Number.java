import java.io.*;

public class Longest_Prime_Number {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size Of Array : ");
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		int temp1 = 0;
		
		System.out.println("Enter the Array Element");	
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());		
			
		}	
		//sorting the Elements
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
			
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
							
				}
			
			}
		}
		
		for (int i = 0; i < arr.length; i++) {		
			//System.out.println(arr[i]);
			
			int count = 0;
			
			for (int j = 2; j < arr[i]; j++) {
				
				if(arr[i] % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				temp1 = arr[i];
				break;
			}			
		}
		
		System.out.println("Greatest Prime Number in the array = "+temp1);
	}	
		
}


/**


Enter the Size Of Array : 
5
Enter the Array Element
77
99
33
44
5
Greatest Prime Number in the array = 5


*/
