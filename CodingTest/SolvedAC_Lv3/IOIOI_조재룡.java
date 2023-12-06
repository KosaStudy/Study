import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOIOI_조재룡 {
    static int N;
    static int M;
    static char[] s;
    static int answer = 0;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        s = br.readLine().toCharArray();
        for(int i=1; i<M-1;i++){
            if(s[i-1] == 'I' && s[i] == 'O' && s[i+1] == 'I'){
                cnt++;
                if(cnt==N){
                    cnt--;
                    answer++;
                }
                i++;
            }else{
                cnt = 0;
            }
        }
        System.out.println(answer);
    }
}