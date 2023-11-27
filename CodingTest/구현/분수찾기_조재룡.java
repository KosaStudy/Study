import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 분수찾기_조재룡 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        int prev_sum = 0;
        int level = 1;
        
        while(true) {
        	if(N <= level + prev_sum) {
        		if(level%2==1) {
        			System.out.println((level-(N-prev_sum-1)) + "/" + (N-prev_sum));
        			break;
        		}else {
        			System.out.println((N-prev_sum) + "/" + (level-(N-prev_sum-1)));
        			break;
        		}
        		
        	}else {
        		prev_sum += level;
        		level++;
        	}
        }
    }
    
   
}