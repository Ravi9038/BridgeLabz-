

import java.io.*;

class Program2{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Number : ");
		int num = Integer.parseInt(br.readLine());

		if(num % 2 == 0){
			
			System.out.println("Entered Number is Even = "+num);

		}else{

			System.out.println("Number is Odd = "+num);
		}
	}
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program2
Enter the Number : 10
Entered Number is Even = 10
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program2
Enter the Number : 3
Number is Odd = 3
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$
*/
