import java.io.*;

/**
 * ReplaceZeroToOne
 */
public class ReplaceZeroToOne {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0,rem = 0,var = 0;

        while (num != 0) {
            
            rem = num % 10;

            if(rem == 0){
                rem = 1;
            }
            sum = sum * 10 + rem;
            num = num / 10;
        }

        while (sum != 0) {
        
            rem = sum % 10;
            var = var * 10 +rem;
            sum = sum / 10;

        }

        System.out.println(var);
    }
}

/**
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_9172f/jdt_ws/jdt.ls-java-project/bin ReplaceZeroToOne 
Enter the Number : 
12450
12451
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_9172f/jdt_ws/jdt.ls-java-project/bin ReplaceZeroToOne 
Enter the Number : 
10050
11151
ravi@ravi-HP-Notebook:~$ 
 */