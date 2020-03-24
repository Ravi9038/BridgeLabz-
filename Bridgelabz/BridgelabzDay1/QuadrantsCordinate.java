import java.io.*;

/**
 * QuadrantsCordinate
 */
public class QuadrantsCordinate {

    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number on by one");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x > 0 && y > 0){

            System.out.println("First Quadrants ");
        }else if(x < 0 && y < 0){

            System.out.println("Third Quadranrs ");
        }else if(x > 0 && y < 0){

            System.out.println("Fourth Quadrants ");

        }else if (x < 0 && y > 0) {
            System.out.println("second quadrants");
        }
        else if(x == 0 && y > 0){

            System.out.println("Lies on positive y axix");

        }else if (y == 0 && x > 0) {

            System.out.println("Lies as positive x axis");

        }else if (x == 0 && y < 0) {
            
            System.out.println("lies as negative y' Axis");

        }else if (y == 0 && x < 0) {
            
            System.out.println("lies on Negative x' axis");
        }else{

            System.out.println("Lies at origin");
        }
    }
}

/**
 * 
 * ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin QuadrantsCordinate 
Enter the Number on by one
1
1
First Quadrants 
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin QuadrantsCordinate 
Enter the Number on by one
0
0
Lies at origin
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin QuadrantsCordinate 
Enter the Number on by one
-1
-2
Third Quadranrs 
ravi@ravi-HP-Notebook:~$ /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -cp /tmp/vscodesws_ae2f4/jdt_ws/jdt.ls-java-project/bin QuadrantsCordinate 
Enter the Number on by one
+7
23
First Quadrants 
ravi@ravi-HP-Notebook:~$ 
 */