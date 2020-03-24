import java.io.*;

/**
 * Floyds_Trangle
 */
public class Floyds_Trangle {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter number who's have start ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Floyd's Trangle ");

        for(int i = 1;i <= row; i++){

            for(int j = 1;j <= i; j++){

                System.out.print(num+" ");
                num++;            
            }

            System.out.println();
        }
    }
}


/**
 * 
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Floyds_Trangle 
Enter the rows
9
Enter number who's have start 
6
Floyd's Trangle 
6 
7 8 
9 10 11 
12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 26 
27 28 29 30 31 32 33 
34 35 36 37 38 39 40 41 
42 43 44 45 46 47 48 49 50 
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */