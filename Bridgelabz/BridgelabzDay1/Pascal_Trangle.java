import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Pascal_Trangle
 */
public class Pascal_Trangle {

       public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the rows"); 
        int rows = Integer.parseInt(br.readLine());

        System.out.println("Enter the number who's want start"); 
        int temp = Integer.parseInt(br.readLine());

        for(int i = 0;i < rows; i++){

            for(int j = 0;j < rows - i; j++){

                System.out.print(" ");
            }

            for(int j = 0;j<=i;j++){

                if (i == 0 || j == 0 ) {
                    
                    System.out.print(temp);
                }else{

                    temp = temp * (i - j + 1) / j;
                    System.out.print(" "+temp);
                }
            }

            System.out.println();
        }
    }
}


/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Pascal_Trangle 
Enter the rows
5
Enter the number who's want start
1
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */