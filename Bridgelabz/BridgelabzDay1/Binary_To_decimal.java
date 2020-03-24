import java.io.*;

/*
 * Binary_To_decimal
 */
public class Binary_To_decimal {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Binary Number = ");
        int num = Integer.parseInt(br.readLine());
        int decimalNum = 0, j = 1, rem = 0;

        while(num != 0){

            rem = num % 10;
            decimalNum = decimalNum + rem * j;
            j = j * 2;
            num = num / 10;
        }

        System.out.println("Decimal Number = "+decimalNum);
    }
}

/*

ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscs_1759f/jdt_ws/jdt.ls-java-project/bin Binary_To_decimal 
Enter Binary Number = 
1010
Decimal Number = 10
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_1759f/jdt_ws/jdt.ls-java-project/bin Binary_To_decimal 
Enter Binary Number = 
11011
Decimal Number = 27
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
/**
 * 
 */