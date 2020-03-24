
import java.io.*;

/**
 * DecimalToBinary
 */
public class DecimalToBinary {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Decimal Number : ");

        int deciNum = Integer.parseInt(br.readLine());
        int arr[] = new int[100];
        int i = 0, rem = 0;
        while (deciNum != 0) {
            
            rem = deciNum % 2;
            arr[i] = rem;
            deciNum = deciNum / 2;
            i++;
        }

        System.out.print("Binary Number = ");
        for(int j = i-1; j>=0;j--){

            System.out.print(arr[j]);
        }        
        System.out.println();
    }
}


/**
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_aba4e/jdt_ws/jdt.ls-java-project/bin DecimalToBinary 
Enter the Decimal Number : 
10
Binary Number = 1010
ravi@ravi-HP-Notebook:~$
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_aba4e/jdt_ws/jdt.ls-java-project/bin DecimalToBinary 
Enter the Decimal Number : 
157
Binary Number = 10011101
ravi@ravi-HP-Notebook:~$  
 */