import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(N);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String Solve(int N){
        int sum=0;
        // Write your code here
        for(int i=1;i<N;i++){
            if(N%i == 0){
                // if(i != N){
                sum += i;
                
        // System.out.println(sum);
        }

        if(sum == N){
            return "YES";
        }
        // else()
                // return "Yes";
            }
            
        // }
        // System.out.println(sum);
        return "NO";

    }
}