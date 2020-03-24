import java.io.*;

/**
 * Program15
 */
public class Program15 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Number :");
        int num = Integer.parseInt(br.readLine());

        int num1 = num, rem = 0,sum = 0;

        while (num1 != 0) {
            
            rem = num1 % 10;
            
            sum = sum + (rem*rem*rem);
            num1 = num1 / 10;
        }

        if(num == sum){

            System.out.println("number is Armstrong Number = "+num);
        }else{
            System.out.println("number is not Armstrong Number = "+num);

        }
        
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550/jdt_ws/jdt.ls-java-project/bin Program15 
Enter the Number :
153
number is Armstrong Number = 153
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550/jdt_ws/jdt.ls-java-project/bin Program15 
Enter the Number :
123
number is not Armstrong Number = 123
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */