import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스_조재룡 {
    static ArrayList<ArrayList<Integer>> graph;
    static int N;
    static int M;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        check = new boolean[N+1];
        M = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        for(int i=0; i<=N;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        bfs(1);
        int cnt = 0;
        for(int i=1;i<=N;i++){
            if(check[i]==true) {
                cnt++;
            }
        }
        System.out.println(cnt-1);
    }

    private static void bfs(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        check[index] = true;
        while(!queue.isEmpty()){
            int a = queue.poll();
            for(int i=0;i<graph.get(a).size();i++){
                if(!check[graph.get(a).get(i)]){
                    queue.add(graph.get(a).get(i));
                    check[graph.get(a).get(i)] = true;
                }
            }
        }
    }
}