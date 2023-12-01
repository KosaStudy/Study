import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_조재룡 {
    static int N;
    static int M;
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for(int i=0;i<N;i++) {
        	String a = br.readLine();
        	for(int j=0;j<M;j++) {
        		arr[i][j] = a.charAt(j) - '0';
        	}
        }
        bfs(new Point(0,0));
        System.out.println(arr[N-1][M-1]);
    }
    
    private static void bfs(Point point) {
		Queue<Point> queue = new LinkedList<>();
		queue.add(point);
		while(!queue.isEmpty()) {
			Point a = queue.poll();
			for(int i=0;i<4;i++) {
				int nx = a.x + dx[i];
				int ny = a.y + dy[i];
				if(nx<0 || ny<0 || nx>=N || ny>=M) continue;
				if(arr[nx][ny]==0) continue;
				if(arr[nx][ny]>1) continue;
				arr[nx][ny] = arr[a.x][a.y] +1;
				queue.add(new Point(nx,ny));
			}
		}
		
	}

	public static class Point {
        int x, y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}