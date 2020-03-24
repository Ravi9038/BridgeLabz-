

import java.io.*;

class Program22{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number");
		int num1 = Integer.parseInt(br.readLine());

		int num2 = num1;
		int sum = 0, rem = 0;


		while(num2 != 0){

			rem = num2 % 10;

			for(int i = 1;i<rem;i++){

				if(rem % i == 0)
					sum = sum + i;
			}

			num2 = num2/10;
			
		}

		if(num1 == sum){

			System.out.println("Number are Perfect number = "+num1);

		}else{

			System.out.println("Number are not Perfect number = "+num1);
		}
	}
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ vim Program22.java
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ javac Program22.java
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program22
Enter the Number
6
Number are Perfect number = 6
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program22
Enter the Number
7
Number are not Perfect number = 7
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$

*/
