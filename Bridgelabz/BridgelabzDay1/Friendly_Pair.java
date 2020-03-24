import java.io.*;

/**
 * Friendly_Pair
 */
public class Friendly_Pair {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers one by one ");

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int sum = 0, sum1 = 0;
        for(int i = 1;i <= num1/2; i++){

            if(num1 % i == 0){

                sum = sum + i;
                //System.out.print(i + ", ");
            }
        }
        System.out.println();

        for(int i = 1; i<=num2/2; i++){

            if(num2 % i == 0){
                sum1 = sum1 + i;
                //System.out.print(i+", ");
            }
        }

/*
        //Logic 1st

        float var1 = sum / num1;
        float var2 = sum1 / num2;

        System.out.println(var1);
        System.out.println(var2);
*/

        //Logic Second

        if( (double)num1/num2 == (double)sum/sum1){

            System.out.println("Both are Friendly Pair : "+sum1 + " = " + sum);
        }else{

            System.out.println("Both are not  Friendly Pair = "+sum1 + " = " + sum);

        }
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesw
s_d3068/jdt_ws/jdt.ls-java-project/bin Friendly_Pair 
Enter two numbers one by one 
6200
40640

Both are Friendly Pair : 56896 = 8680
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_d3068/jdt_ws/jdt.ls-java-project/bin Friendly_Pair 
Enter two numbers one by one 
10
30

Both are not  Friendly Pair = 42 = 8
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */