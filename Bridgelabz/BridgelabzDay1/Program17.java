import java.io.*;

/**
 * Program17
 */
public class Program17 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the range");
        int num = Integer.parseInt(br.readLine());

        int num1 = 0, num2 = 1, sum = 0;

        for(int i = 0;i<num;i++){

            System.out.println(num1);
            sum = num1+num2;  
            num1 = num2;
            num2 = sum;
        }
    }
}


/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550/jdt_ws/jdt.ls-java-project/bin Program17 
Enter the range
10
0
1
1
2
3
5
8
13
21
34
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */