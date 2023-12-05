import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 프린터큐_조재룡 {
    static int N;
    static int M;
    static int K;
    static int cnt = 0;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            Queue<Document> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++){
                queue.add(new Document(i,Integer.parseInt(st.nextToken())));
            }
            cnt = 1;

            while(!queue.isEmpty()){
                max = 0;
                //여기서 max 구하기
                for (Document document : queue) {
                    if(max<document.important){
                        max = document.important;
                    }
                }

                Document document = queue.poll();
                if(document.important==max){
                    if(document.index==K){
                        System.out.println(cnt);
                        break;
                    }else{
                        cnt++;
                    }
                }else{
                    queue.add(document);
                }
            }
        }
    }

    static class Document{
        int index, important;
        Document(int index, int important){
            this.index = index;
            this.important = important;
        }
    }
}