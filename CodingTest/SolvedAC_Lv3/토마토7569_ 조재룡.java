import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class 토마토(7569)_조재룡 {
    static int N;
    static int M;
    static int H;
    static int[][][] tomato;
    static int[] dx = { 0, -1, 1, 0, 0, 0, };
    static int[] dy = { 0, 0, 0, -1, 1, 0 };
    static int[] dz = { -1, 0, 0, 0, 0, 1 };
    static Queue<Tomato> queue = new LinkedList<>();
    static int answer = -1;
    static class Tomato{
        int x, y, z;
        Tomato(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        tomato = new int[H][N][M];

        for(int i=0;i<H;i++){
            for(int j=0;j<N;j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<M;k++){
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                    if(tomato[i][j][k]==1) {
                        queue.add(new Tomato(j,k,i));
                    }
                }
            }
        }

        bfs();
        Loop1:
        for(int i=0;i<H;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<M;k++){
                    if(tomato[i][j][k]==0) {
                        answer = -1;
                        break Loop1;
                    }
                    answer = Math.max(answer,tomato[i][j][k]);
                }
            }
        }
        if(answer==-1){
            System.out.println(-1);
        }else if(answer==1){
            System.out.println(0);
        }else{
            System.out.println(answer-1);
        }

    }

    public static void bfs(){
        while(!queue.isEmpty()){
            Tomato a = queue.poll();
            for(int i=0;i<6;i++){
                int nx = a.x + dx[i];
                int ny = a.y + dy[i];
                int nz = a.z + dz[i];
                if(nx<0 || ny<0 || nz<0 || nx >= N || ny >= M || nz >= H) continue;
                if(tomato[nz][nx][ny]>0 || tomato[nz][nx][ny]==-1) continue;
                tomato[nz][nx][ny] = tomato[a.z][a.x][a.y] + 1;
                queue.add(new Tomato(nx,ny,nz));
            }
        }
    }
}
