
import java.io.*;

class Program10{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Entered the range :");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("Prime Numbers ");
        for(int i=num1;i<=num2;i++){

            int count = 0;

            for(int j=2;j<i;j++){

                if(i%j == 0){
                    
                    count++;
                    break;
                }
            }

            if(count == 0){

                System.out.println(i);
            }
        }
    }
}

/**
 * Entered the range :
100
200
Prime Numbers 
101
103
107
109
113
127
131
137
139
149
151
157
163
167
173
179
181
191
193
197
199
ravi@ravi-HP-Notebook:~$ ^C
 */