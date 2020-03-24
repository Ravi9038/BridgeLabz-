import java.io.*;

/**
 * Strong_Number
 */
public class Strong_Number {
   
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number :");
        int num = Integer.parseInt(br.readLine());

        int temp = num, rem = 0, sum = 0;

        while (temp != 0) {
            int fact = 1;
            rem = temp % 10;            
            for(int i = 1; i<=rem; i++){
                
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
        }

        if(num == sum ){

            System.out.println("Number is Strong Number = "+num);
        }else{

            System.out.println("Number is Not Strong Number = "+sum);
        }
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesw
s_6a192/jdt_ws/jdt.ls-java-project/bin Strong_Number 
Enter the Number :
145
Number is Strong Number = 145
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesw
s_6a192/jdt_ws/jdt.ls-java-project/bin Strong_Number 
Enter the Number :
125
Number is Not Strong Number = 123
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 

 */