import java.io.*;

/**
 * Binary_To_Octal
 */
public class Binary_To_Octal {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        int binNum = Integer.parseInt(br.readLine());
        int j = 1,deciNum = 0, rem = 0;
        while (binNum != 0) {
        
            rem = binNum % 10;
            deciNum = deciNum + rem * j; 
            j = j * 2;          
            binNum = binNum / 10;           
            
        }

        System.out.println("Decimal Number = "+deciNum);

        int octNum[] = new int[100];
        int i = 0;

        while (deciNum != 0) {
            
            int rem1 = deciNum % 8;
            octNum[i++] = rem1;
            deciNum = deciNum / 8;
        }

        System.out.print("Octal Number = ");

        for (int k = i-1; k >= 0; k--) {
          
            System.out.print(octNum[k]);
        }

        System.out.println();
    }
}

/**
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_aba4e/jdt_ws/jdt.ls-java-project/bin Binary_To_Octal 
101010
Decimal Number = 42
Octal Number = 52
ravi@ravi-HP-Notebook:~$ 
 */