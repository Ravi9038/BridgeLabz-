import java.io.*;
/**
 * Pyramid_Star_Pattern
 */
public class Pyramid_Star_Pattern {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of Rows :");
        int num = Integer.parseInt(br.readLine());

        for(int i=1;i<=num;i++){
            
            for(int k = 1;k<=num-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<2*i;j++){

                System.out.print("*");
            }

            System.out.println();
        }
        
    }
    
}