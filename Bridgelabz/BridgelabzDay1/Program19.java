
import java.io.*;

/**
 * Program19 factors of the number
 */
public class Program19 {

    public static void main(String[] args) throws IOException{
        
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Factor of those Number = ");
        for(int i=1;i<=num;i++){

            if(num % i == 0){

                System.out.print(i+", ");
            } 
        }

        System.out.println();

    }
}
