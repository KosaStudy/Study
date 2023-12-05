package CodingTest.SolvedAC_Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 방번호_양석진 {
    static int M;
    static int N;
    static int[] price;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        price = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int x = 0; x<N; x++){
            price[x] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());

        int ans[] = new int[100];
        int cost = 0;
        int idx = 0;

        int minIdx = findMin(0);
        // 0이 가장 저렴할 때
        if(minIdx == 0){
            minIdx = findMin(1);
            if(price[minIdx] <= M) {
                ans[idx++] = minIdx;
                cost += price[minIdx];
                minIdx = 0;
            }else{
                System.out.println(0);
                return;
            }
        }
        while(cost + price[minIdx] <= M){
            ans[idx++] = minIdx;
            cost += price[minIdx];
        }

        // 가장 앞에서 부터 큰 숫자로 교체 시도
        // 아 스벌 포기

    }

    public static int findMin(int start){
        int retIdx = 0, min = 100;
        for(int i = start; i < N; i++){
            if(min > price[i]){
                min = price[i];
                retIdx = i;
            }
        }
        return retIdx;
    }
}
