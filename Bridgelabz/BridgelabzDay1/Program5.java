
import java.io.*;

class Program6{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Two Numbers One by One :");
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		if(num1 > num2){

			System.out.println("Number1 is Greater = " +num1);
		}else if(num2 > num1){

			System.out.println("Number2 is Greater = " +num2);
		}else{

			System.out.println("Both Number are Same = "+num1);

		}
	}

}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Two Numbers One by One :
10
20
Number2 is Greater = 20
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Two Numbers One by One :
20
10
Number1 is Greater = 20
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Two Numbers One by One :
10
10
Both Number are Same = 10
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$
*/
