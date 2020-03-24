import java.io.*;

class Program9{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter theOne number : ");
        int num = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i =2 ;i<num; i++) {
    
            if(num % i == 0){

                count++;
                break;
            }
        }

        if(count == 0){

            System.out.println("Entered Number is Prime Number :" +num);
        }else{
            System.out.println("Enteres Number is Not Prime : "+num);
        }
    }
}

/**
 * ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Two Numbers One by One :
10
20
Number2 is Greater = 20
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Two Numbers One by One :
20
10
Number1 is Greater = 20
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ java Program6
Enter the Two Numbers One by One :
10
10
Both Number are Same = 10
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 

 */