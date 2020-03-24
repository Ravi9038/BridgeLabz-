
import java.io.*;
/**
 * Automorphic_Num
 */
public class Automorphic_Num {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        int num = Integer.parseInt(br.readLine());
        int square = num*num, count = 0,num1 = num;
        System.out.println("Square of those Number "+ square);
        
        int rem1 = 0,rem2 = 0,sum = 0,sum1 = 0;
        
        while(num1 != 0){
            rem1 = num1 % 10;
            sum = sum * 10 + rem1;
            num1 = num1 / 10;
        }
        while (square != 0) {
            count++;
            rem2 = square % 10;
            sum1 = sum1 * 10 + rem2;
            square = square / 10;
            if(count == 2){
                break;
            }
        }
        if(sum == sum1){

            System.out.println("Number is automorphic = "+num);
        }else{

            System.out.println("Number is not automorphic = "+num);

        }
    }
    
}

/**
 * Enter the Number : 
25
Square of those Number 625
Number is automorphic = 25
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_d3068/jdt_ws/jdt.ls-java-project/bin Automorphic_Num 
Enter the Number : 
5
Square of those Number 25
Number is not automorphic = 5
 */