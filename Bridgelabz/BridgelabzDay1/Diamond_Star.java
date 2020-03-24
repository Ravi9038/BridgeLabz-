

/**
 * Diamond_Star
 */
public class Diamond_Star {

    public static void main(String[] args) {
        
        for(int i=1;i<=7;i++){

            for(int j = 1;j<=7;j++){

                if(i+j <= 4 || j-i >= 4 || i-j >= 4 || i+j >= 12){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
       
    }
}

/**
 
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin Diamond_Star 
   *   
  ***  
 ***** 
*******
 ***** 
  ***  
   *   
ravi@ravi-HP-Notebook:~/Documents/Bridgelabz/BridgelabzDay1$ 

 */