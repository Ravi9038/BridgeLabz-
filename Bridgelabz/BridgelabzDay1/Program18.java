import java.io.*;

/**
 * Program18 Factorial of Number
 */
public class Program18 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());

        int fact = 1;

        for(int i=1;i<=num;i++){

            fact = fact * i;
        }

        System.out.println("Factorial of Number = "+fact);
    }
}

/**
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550/jdt_ws/jdt.ls-java-project/bin Program18 
Enter the number
5
Factorial of Number = 120
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550/jdt_ws/jdt.ls-java-project/bin Program18 
Enter the number
10
Factorial of Number = 3628800
ravi@ravi-HP-Notebook:~$ 
 */