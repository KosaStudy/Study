import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
 
public class 최소힙_조재룡 {
   static int N;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
        	int a = Integer.parseInt(br.readLine());
        	if(a==0) {
        		if(queue.isEmpty()) {
        			System.out.println(0);
        		}else {
        			System.out.println(queue.poll());
        		}
        		
        	}else {
        		queue.add(a);
        	}
        }
        
    }
}