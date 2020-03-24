import java.io.*;

class Program8{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Year ");

        int num = Integer.parseInt(br.readLine());

        if((num % 4 || num % 400) && num != 100){

            System.out.println("Entered Year is Leap Year = "+num);
        }else{
            
            System.out.println("Entered Year is not Leap Year = "+num);
        }
    }
}