import java.io.*;
/**
 * Highest_common_Factor
 */
public class Highest_common_Factor {
        
    public static void main(String [] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number one by one");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int highComm = 0;
        for (int i = 1; i <= num1 && i <= num2; i++){ 
            
            if (num1 % i ==  num2%i) {
                
                highComm = i;
            }
        }       

        System.out.println("highest common factor : "+highComm);
    }
    
}

/**
 * Enter the number one by one
16
3
highest common factor : 1
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_1759f/jdt_ws/jdt.ls-java-project/bin Highest_common_Factor 
Enter the number one by one
55
25
highest common factor : 15
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */