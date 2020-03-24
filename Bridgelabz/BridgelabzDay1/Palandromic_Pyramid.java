import java.io.*;

/**
 * Palandromic_Pyramid
 */
public class Palandromic_Pyramid {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the rows");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Enter the want start :");
        int num2 = Integer.parseInt(br.readLine());

        int temp = num2; 
        for(int i=1;i<=num;i++){

            for (int j = 1; j<=num-i;j++) {

                System.out.print("  ");
            }

            int num1 = num2;
            int temp1 = temp;
            for(int j=1;j<2*i;j++){

                if(i  >= j){

                    System.out.print(num1+" ");
                    num1++;
                }else{
                    System.out.print(temp1+" ");
                    temp1--;
                } 
     
            }
            if(i > 1)
               temp++;        
            System.out.println();
        }
    }
}

/**
 
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Palandromic_Pyramid 
Enter the rows
5
Enter the want start :
1
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Palandromic_Pyramid 
Enter the rows
6
Enter the want start :
6
          6 
        6 7 6 
      6 7 8 7 6 
    6 7 8 9 8 7 6 
  6 7 8 9 10 9 8 7 6 
6 7 8 9 10 11 10 9 8 7 6 
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 

 */