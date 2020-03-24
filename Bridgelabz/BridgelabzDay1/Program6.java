
import java.io.*;



class Program6{

	public static void main(String [] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Range start to end");
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int sum = 0;

		for(int i = num1;i <= num2;i++){

			sum = sum + i;
		}

		System.out.println("Sum of given range of Numbers = "+sum);

	}
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ vim Program6.java
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ javac Program6.java
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Range start to end
1
20
Sum of given range of Numbers = 210
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Range start to end
20
30
Sum of given range of Numbers = 275
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$
*/

