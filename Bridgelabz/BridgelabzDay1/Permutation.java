import java.io.*;

/**
 * Permutation
 */
public class Permutation {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Eneter the N People ");
        double num = Integer.parseInt(br.readLine());

        System.out.println("Enter the R seats");
        double seats = Integer.parseInt(br.readLine());

        if(num < seats){

            System.out.println(" Please enter : num >= seats >= 0");
        }

        double fact = 1, fact1 = 1;
        seats = num - seats;
        
        for(int i = 1;i <= num;i++ ){

            fact = fact * i;
        }

        for(int i = 1; i <= seats; i++ ){
            
            fact1 = fact1 * i;
        }
        double var = fact / fact1;
        System.out.println("Seats of the aval = "+ var);
    }
}

/**
 * 
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_6a192/jdt_ws/jdt.ls-java-project/bin Permutation 
Eneter the N People 
6
Enter the R seats
5
Seats of the aval = 720
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_6a192/jdt_ws/jdt.ls-java-project/bin Permutation 
Eneter the N People 
9
Enter the R seats
5
Seats of the aval = 15120
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$

ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_6a192/jdt_ws/jdt.ls-java-project/bin Permutation 
Eneter the N People 
121
Enter the R seats
12
Seats of the aval = 5.606015030436836E24
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */