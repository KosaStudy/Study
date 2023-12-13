import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class 통계학_조재룡 {
    static int N;
    static int[] check = new int[8003];
    static int[] arr;
    static double sum=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>=0) check[arr[i]] += 1;
            else check[Math.abs(arr[i])+4000] += 1;
            sum += arr[i];
        }
        // 산술평균
        System.out.println(Math.round(sum/N));
        Arrays.sort(arr);

        // 중앙값
        System.out.println(arr[N/2]);

        //최빈값
        int max = 0;
        for(int i=0;i< check.length;i++){
            max = Math.max(max,check[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< check.length;i++){
            if(check[i]==max){
                if(i<=4000) list.add(i);
                else list.add((i-4000) * -1);
            }
        }
        Collections.sort(list);

        if(list.size()>1) System.out.println(list.get(1));
        else System.out.println(list.get(0));

        //범위
        System.out.println(arr[N-1]-arr[0]);


    }

}
