import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 제로_조재룡 {

    static int N;

    static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());

            if(a==0){
                stack.pop();
            }else{
                stack.push(a);
            }
        }


        for(int i=0;i<stack.size();i++){
            sum += stack.get(i);
        }
        System.out.println(sum);
    }

}
