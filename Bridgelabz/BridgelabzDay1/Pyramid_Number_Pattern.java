

import java.io.*;

/**
 * Pyramid_Number_Pattern
 */
public class Pyramid_Number_Pattern {
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the rows");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Enter the number which have start");
        int num1 = Integer.parseInt(br.readLine());

        for(int i = 1;i<=num;i++){

            for(int k = num; k > i;k--){
                System.out.print("  ");
            }

            for(int j=1;j< 2*i;j++){

                System.out.print(num1 + " ");
            }
            num1++;
            System.out.println();
        }
    }
}

/**

Enter the rows
5
Enter the number which have start
1
        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 
ravi@ravi-HP-Notebook:~$ 

 */