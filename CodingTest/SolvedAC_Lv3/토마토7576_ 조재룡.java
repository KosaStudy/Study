import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class 토마토7576_조재룡 {
    static int N;
    static int M;
    static int[][] tomato;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {-1,0,1,0};
    static Queue<Tomato> queue = new LinkedList<>();
    static int answer = -1;
    static class Tomato{
        int x, y;
        Tomato(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        tomato = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M;j++){
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j]==1) queue.add(new Tomato(i,j));
            }
        }
        bfs();
        int cnt = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(tomato[i][j]==0){
                    cnt++;
                }
                answer = Math.max(answer,tomato[i][j]);
            }
        }
        if(cnt>0) System.out.println(-1);
        else System.out.println(answer-1);
    }

    public static void bfs(){
        while (!queue.isEmpty()){
            Tomato a = queue.poll();
            for(int i=0;i<4;i++){
                int nx = a.x + dx[i];
                int ny = a.y + dy[i];
                if(nx<0 || ny <0 || nx>=N || ny>=M) continue;
                if(tomato[nx][ny]==-1 || tomato[nx][ny]>0) continue;
                tomato[nx][ny] = tomato[a.x][a.y] + 1;
                queue.add(new Tomato(nx,ny));
            }
        }
    }
}
