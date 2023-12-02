import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 요세푸스문제_조재룡 {

    static int N, K;

    static ArrayList<Integer> list = new ArrayList<>();

    static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            list.add(i+1);
        }
        sb.append("<");
        while(!list.isEmpty()){
            if(list.size()==1){
                sb.append(list.remove(0)).append(">");
            }else{
                for(int i=0;i<K;i++){
                    if(i==K-1){
                        sb.append(list.remove(0)).append(", ");
                    }else{
                        list.add(list.remove(0));
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
