
import java.io.*;

class Program11 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fact = 1;
        System.out.println("Enter the Nunber");
        int num = Integer.parseInt(br.readLine());

        for (int i=1;i<=num;i++) {
            
            fact = fact * i;
        }

        System.out.println("Factorial of this Number : "+fact);

    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodes
ws_5a550/jdt_ws/jdt.ls-java-project/bin Program11 
Enter the Nunber
5
Factorial of this Number : 120
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */