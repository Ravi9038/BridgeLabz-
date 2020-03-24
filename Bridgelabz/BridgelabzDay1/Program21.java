

import java.io.*;

class Program21{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number");

		int num = Integer.parseInt(br.readLine());

		System.out.println("Power Of Number = "+(num*num));
	}
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ javac Program21.java
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program21
Enter the Number
5
Power Of Number = 25
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$
*/
