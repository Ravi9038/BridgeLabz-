
import java.io.*;

class PositiveNegativeDemo{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number : ");

		int num = Integer.parseInt(br.readLine());

		if(num < 0){

			System.out.println("Entered Number is Negative = "+num);
		}else if(num > 0){

			System.out.println("Entered Number is Positive = "+num);
		}else{

			System.out.println("Entered Number is equal to zero = "+num);
		}

	}
}


/**
 *
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ vim PositiveNegative.java
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ javac PositiveNegative.java
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java PositiveNegativeDemo
Enter the Number :
1
Entered Number is Positive = 1
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java PositiveNegativeDemo
Enter the Number :
2
Entered Number is Positive = 2
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java PositiveNegativeDemo
Enter the Number :
-4
Entered Number is Negative = -4
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java PositiveNegativeDemo
Enter the Number :
0
Entered Number is equal to zero = 0
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$
*/
