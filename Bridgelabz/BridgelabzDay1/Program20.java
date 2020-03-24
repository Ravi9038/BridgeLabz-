import java.io.*;

/**
 * Program20 Strong Number
 */
public class Program20 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number :");
        int num = Integer.parseInt(br.readLine());

        int rem = 0,sum = 0, num1 = num;
        
        while (num1 != 0) {
            
            rem = num1 % 10;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                fact = fact * i;
            }
            sum = sum + fact;
            num1 = num1 / 10;
        }
        
        if(num == sum){
        
            System.out.println("Number is Strong Number = "+num);
        
        }else{
            
            System.out.println("Number is not Strong Number = "+num);
        }
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550
/jdt_ws/jdt.ls-java-project/bin Program20 
Enter the Number :
145
145
Number is Strong Number = 145
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_5a550
/jdt_ws/jdt.ls-java-project/bin Program20 
Enter the Number :
124
27
Number is not Strong Number = 124
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */