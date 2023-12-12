import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 카잉달력_조재룡 {
    static int N;
    static int M;
    static int x;
    static int y;
    static int T;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken())-1;
            y = Integer.parseInt(st.nextToken())-1;
            answer = 0;
            boolean check = false;
            for(int i=x;i<M*N;i+=M){
                if(i%N==y){
                    check = true;
                    answer = i;
                    break;
                }
            }
            if(!check) System.out.println(-1);
            else System.out.println(answer+1);

        }

    }

}
