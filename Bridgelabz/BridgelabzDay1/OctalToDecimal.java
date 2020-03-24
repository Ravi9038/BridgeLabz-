
import java.io.*;

/**
 * OctalToDecimal
 */
public class OctalToDecimal {

    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Octal Number");
        int octNum = Integer.parseInt(br.readLine());
        int i = 1, deciNum = 0;

        while (octNum != 0) {
            
            int rem = octNum % 10;
            octNum = octNum / 10;

            deciNum = deciNum + (rem * i);

            i = i * 8; 

        }

        System.out.println("Decimal Number = "+deciNum);
    }
}


/**
 * 
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_aba4e/jdt_ws/jdt.ls-java-project/bin OctalToDecimal 
Enter the Octal Number
10
Decimal Number = 8
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_aba4e/jdt_ws/jdt.ls-java-project/bin OctalToDecimal 
Enter the Octal Number
12
Decimal Number = 10
ravi@ravi-HP-Notebook:~$ 
 */