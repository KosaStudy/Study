import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class 이중우선순위큐_조재룡 {
    static int T;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-->0){
            N = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                int b = Integer.parseInt(st.nextToken());

                if(a.equals("I")){
                    map.put(b,map.getOrDefault(b,0)+1);
                }else{
                    if(map.isEmpty()) continue;
                    else{
                        int num = b== -1 ? map.firstKey() : map.lastKey();
                        if(map.get(num)==1) map.remove(num);
                        else map.put(num,map.get(num)-1);
                    }
                }
            }
            if(map.size()==0){
                System.out.println("EMPTY");
            }else{
                System.out.println(map.lastKey() + " " + map.firstKey());
            }
        }
    }
}
