import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단지번호붙이기_조재룡 {
    static int N;
    static int[][] apart;
    static ArrayList<Integer> list = new ArrayList<>();
    static int cnt=0;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {-1,0,1,0};
    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        apart = new int[N][N];

        for(int i=0;i<N;i++){
            String a = br.readLine();
            for(int j=0; j<N;j++){
                apart[i][j] = a.charAt(j)-'0';
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0; j<N; j++){
                if(apart[i][j]==1){
                    bfs(new Point(i,j));
                    cnt++;
                }
            }
        }

        Collections.sort(list);
        System.out.println(cnt);
        for (int a : list) {
            System.out.println(a);
        }
    }

    private static void bfs(Point point) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);

        apart[point.x][point.y] = 2;
        int count = 0;
        while(!queue.isEmpty()){
            Point a = queue.poll();
            count++;
            for(int i=0; i<4; i++){
                int nx = a.x + dx[i];
                int ny = a.y + dy[i];
                if(nx<0 || ny<0|| nx>=N || ny>=N) continue;
                if(apart[nx][ny]==0 || apart[nx][ny]==2) continue;
                apart[nx][ny] = 2;
                queue.add(new Point(nx,ny));
            }
        }
        list.add(count);
    }
}
