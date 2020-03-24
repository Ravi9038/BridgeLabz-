import java.io.*;

/**
 * Program13
 */
public class Program13 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Numeber : ");
        int num = Integer.parseInt(br.readLine());

        int rem = 0,sum = 0;
        while(num != 0){

            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10; 
        }

        System.out.println("Reverse Number = "+sum);
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodes
ws_5a550/jdt_ws/jdt.ls-java-project/bin Program13 
Enter the Numeber : 
12345
Reverse Number = 54321
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 

 */