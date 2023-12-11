import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class 색종이_조재룡 {
    static int N;
    static int[][] retangle;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        retangle = new int[101][101];

        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            for(int i=a;i<a+10;i++){
                for(int j=b;j<b+10;j++){
                    if(retangle[i][j]==0){
                        retangle[i][j]=1;
                    }else{
                        retangle[i][j]=2;
                    }
                }
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=1;i<101;i++){
            for(int j=1;j<101;j++){
                if(retangle[i][j]==1) cnt1++;
                if(retangle[i][j]==2) cnt2++;
            }
        }
        System.out.println(cnt1+cnt2);
    }
}
