import java.io.*;

/**
 * OctalToBinary
 */
public class OctalToBinary {

     public static void main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Octal Number ");
        int octNum = Integer.parseInt(br.readLine());
        int i = 1, rem = 0, deciNum = 0;

        while (octNum != 0) {
            
            rem = octNum % 10;
            octNum = octNum / 10;
            
            deciNum = deciNum + rem * i;

            i = i * 8;
        }

        System.out.println("OctalToDecimal Num = "+deciNum);

        int rem1 = 0, k = 0;
        int arr[] = new int[100];

        while (deciNum != 0) {
            
            rem1 = deciNum % 2;
            arr[k] = rem1;
            deciNum = deciNum / 2;
            k++;
            
        }
        System.out.print("Binary Number :");
        for(int j = k-1; j>=0;j--){
            System.out.print(arr[j]);
        }
        System.out.println();
     }
}

/**
 * 
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_629e2/jdt_ws/jdt.ls-java-project/bin OctalToBinary 
Enter the Octal Number 
12
OctalToDecimal Num = 10
Binary Number :1010
ravi@ravi-HP-Notebook:~$ 
 */