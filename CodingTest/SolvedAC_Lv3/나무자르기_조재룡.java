import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 나무자르기_조재룡 {
    static int N;
    static int M;
    static int[] namo;
    static int max = 0;
    static int min = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        namo = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            namo[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, namo[i]);
        }

        while(min<max){
            int mid = (min + max) /2;
            long sum = 0;

            for(int i : namo){
                if(i-mid>0) sum += i-mid;
            }

            if(sum<M){
                max = mid;
            }else{
                min = mid+1;
            }
        }

        System.out.println(max-1);

    }
}
