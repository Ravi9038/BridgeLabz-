import java.io.*;

/**
 * Program12
 */
class Program12 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number :");

        int num = Integer.parseInt(br.readLine());
        int rem = 0,sum = 0;

        while (num != 0) {
            
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of Digit Number : "+sum);
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodes
ws_5a550/jdt_ws/jdt.ls-java-project/bin Program12 
Enter the Number :
12345
Sum of Digit Number : 15
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 

 */