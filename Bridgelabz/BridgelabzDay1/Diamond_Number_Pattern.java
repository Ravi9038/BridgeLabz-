

/**
 * Diamond_Number_Pattern
 */
public class Diamond_Number_Pattern {

    public static void main(String[] args) {
    
        for(int i = 1; i <= 7; i++){
            int num = 1;
            for(int j = 1; j <= 7;j++){

                if(i+j <= 4 || j-i >=4 || i-j >= 4 || i+j >= 12){
                    
                    System.out.print(" ");
                }else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
            
        }
    }
}



/**
 
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Diamond_Number_Pattern 
   1   
  123  
 12345 
1234567
 12345 
  123  
   1   
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 
 */