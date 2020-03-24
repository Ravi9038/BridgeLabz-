import java.io.*;

/**
 * Program14
 */
public class Program14 { 

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the numbers");
        int num = Integer.parseInt(br.readLine());

        int num1 = num, sum = 0,rem = 0;
        while (num1 != 0) {
            
            rem = num1 % 10;
            sum = sum * 10 + rem;
            num1 = num1 / 10;

        }

        if (num == sum) {
            
            System.out.println("Number is Palindrome Number = "+num);
        }else{
            System.out.println("Number is not Palindrome Number = "+num);

        }


    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550
/jdt_ws/jdt.ls-java-project/bin Program14 
Enter the numbers
151
Number is Palindrome Number = 151
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550/jdt_ws/jdt.ls-java-project/bin Program14 
Enter the numbers
124
Number is not Palindrome Number = 124
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */