

import java.io.*;

/**
 * Perfect_Number
 */
public class Perfect_Number {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Number");
        int perNum = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 1;i<=perNum/2;i++){

            if(perNum % i == 0){

                sum = sum + i;
            }
        }

        if(perNum == sum )
            System.out.println("Perfect Number = "+perNum);
        else
            System.out.println("This is Not Perfect Number = "+perNum);
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Perfect_Number 
Enter the Number
6
Perfect Number = 6
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Perfect_Number 
Enter the Number
28
Perfect Number = 28
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Perfect_Number 
Enter the Number
9
This is Not Perfect Number = 9
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */