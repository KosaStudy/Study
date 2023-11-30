import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AC_조재룡 {
    static int T;
    static boolean reverse;
    static ArrayDeque<Integer> deque;

    static StringBuilder sb = new StringBuilder();
    static String operation;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while(T-->0){
            operation = br.readLine();
            int n = Integer.parseInt(br.readLine());
            deque = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine(),",[]");
            for(int i=0; i<n; i++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            reverse = false;
            AC(deque,operation);
        }

        System.out.println(sb);
    }

    private static void AC(ArrayDeque<Integer> deque, String operation) {

        for(char c : operation.toCharArray()){
            if(c=='R'){
                reverse = !reverse;
            }else{
                if(reverse){
                    if(deque.pollLast()==null){
                        sb.append("error\n");
                        return;
                    }
                }else{
                    if(deque.pollFirst()==null) {
                        sb.append("error\n");
                        return;
                    }
                }
            }
        }

        sb.append('[');
        if(deque.size()>0){
            if(!reverse){
                sb.append(deque.pollFirst());

                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollFirst());
                }
            }else{
                sb.append(deque.pollLast());

                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollLast());
                }
            }
        }
        sb.append(']').append('\n');
    }
}
