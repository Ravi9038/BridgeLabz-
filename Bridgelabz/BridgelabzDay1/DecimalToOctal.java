import java.io.*;

/**
 * DecimalToOctal
 */
public class DecimalToOctal {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Decimal Number");
        int deciNum = Integer.parseInt(br.readLine());
        int rem = 0,i=0;
        int arr[] = new int[100];

        while (deciNum != 0) {
            
            rem = deciNum % 8;
            arr[i] = rem;
            deciNum = deciNum / 8;
            i++;
        }


        System.out.print("Octal Number = ");
        for(int j = i-1; j >= 0; j--){

            System.out.print(arr[j]);
        }

        System.out.println();
    }
}

/**
 * 
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_aba4e/jdt_ws/jdt.ls-java-project/bin DecimalToBinary 
Enter the Decimal Number : 
157
Binary Number = 10011101
ravi@ravi-HP-Notebook:~$ 

 */