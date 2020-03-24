import java.io.*;

class Program7{

	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Entered the three Numbers One by One : ");

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		if(num1 > num2){

			if(num1 > num3){

				System.out.println("Number1 is greater = "+num1);
			}else{

				System.out.println("Number three is greater = "+num3);
			}
		}else if(num2 > num3){

			System.out.println("Number2 is greater = "+num2);
		}else {

			System.out.println("Number3 is Greater = "+num3);
		}

	}

}
