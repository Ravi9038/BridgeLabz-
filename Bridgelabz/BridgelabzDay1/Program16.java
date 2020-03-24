import java.io.*;

/**
 * Program16
 */
public class Program16 {

    public static void main(String[] args)  throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the range");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
       
        System.out.println("Armstrong Number");
        for (int i = num1;i<=num2;i++) {
            
            int temp = i,rem = 0,sum = 0;

            while(temp != 0){

                rem = temp % 10;
                sum = sum + (rem*rem*rem);
                temp = temp / 10;
            }

            if(sum == i){

                System.out.println(i);
            }
        }
                
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550/jdt_ws/jdt.ls-java-project/bin Program16 
Enter the range
100
1000
Armstrong Number
153
370
371
407
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */