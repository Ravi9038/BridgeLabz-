

import java.io.*;

class Program4{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Entered The Limit :");
		int num,sum = 0;

		num = Integer.parseInt(br.readLine());

		for(int i = 1;i<=num;i++){

			sum = sum + i;
		}

		System.out.println("Sum of N Natural Number = "+sum);

	}
}
