import java.io.*;

/**
 * Abundant_num
 */
public class Abundant_num {

public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the Number : ");
    int num = Integer.parseInt(br.readLine());
    int sum = 0;
    for(int i = 1;i <= num/2;i++){

        if(num%i == 0){

            sum = sum + i;
        }
    }

        if(sum >= num){
            System.out.println("Number is Abundant Number: "+num);
        }else{
            System.out.println("Number is not Abundunt : "+num);
        }

    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_d3068/jdt_ws/jdt.ls-java-project/bin Abundant_num 
Enter the Number : 
12
Number is Abundant Number: 12
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_d3068/jdt_ws/jdt.ls-java-project/bin Abundant_num 
Enter the Number : 
21
Number is not Abundunt : 21
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */
