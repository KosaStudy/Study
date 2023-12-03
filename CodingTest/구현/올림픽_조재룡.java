import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 올림픽_조재룡 {

    static int N, K;

    static int[][] contry;

    static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        contry = new int[N][5];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4;j++){
                contry[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(contry, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] != o2[1]) return o2[1]-o1[1];
                if(o1[2] != o2[2]) return o2[2]-o1[2];
                if(o1[3] != o2[3]) return o2[3]-o1[3];
                return o2[0]-o1[0];
            }
        });

        contry[0][4] = 1;

        for(int i=1;i<N;i++){
            if(contry[i-1][1] == contry[i][1] && contry[i-1][2] == contry[i][2] && contry[i-1][3] == contry[i][3]){
                    contry[i][4] = contry[i-1][4];
            }else{
                contry[i][4] = i+1;
            }
        }

        for(int i=0;i<N;i++){
            if(contry[i][0]==K){
                System.out.println(contry[i][4]);
                break;
            }
        }

    }

}