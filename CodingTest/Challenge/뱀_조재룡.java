import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 뱀_조재룡 {
    //보드 크기
    static int N;
    //사과 개수
    static int K;
    static int[] dx = {0,1,0,-1};
    static int[] dy= {1,0,-1,0};
    static int L;
    static int[][] dummy;
    static int cnt=2;
    static ArrayList<Point> bam = new ArrayList<>();
    static HashMap<Integer, String> hashMap = new HashMap<>();
    static class Point{
        int x,y,direction,cho;
        Point(int x, int y, int cho,int direction){
            this.x =x;
            this.y =y;
            this.cho = cho;
            this.direction = direction;
        }
    }

    static int answer=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dummy = new int[N+1][N+1];
        K = Integer.parseInt(br.readLine());
        while(K-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dummy[a][b] = 1;
        }
        L = Integer.parseInt(br.readLine());
        while(L-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();
            hashMap.put(a,b);
        }
        bfs();
        System.out.println(answer-1);
    }

    // 지나가면 뱀 몸통 2, 사과는 1
    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(1,1,1,0));
        bam.add(new Point(1,1,1,0));
        dummy[1][1] = 2;
        while (!queue.isEmpty()){
            Point a = queue.poll();
            int nx = a.x + dx[a.direction];
            int ny = a.y + dy[a.direction];
            if(nx<1 || ny <1 || nx>N || ny>N || dummy[nx][ny]==2){
                answer = a.cho+1;
                break;
            }
            if(hashMap.containsKey(a.cho)){
                //오른쪽
                if(hashMap.get(a.cho).equals("D")){
                    int direction = (a.direction+1)%4;
                    if(dummy[nx][ny]==1){
                        dummy[nx][ny]=2;
                        queue.add(new Point(nx,ny,a.cho+1,direction));
                        bam.add(new Point(nx,ny,a.cho+1,direction));
                    }else{
                        dummy[bam.get(0).x][bam.get(0).y]=0;
                        bam.remove(0);
                        dummy[nx][ny]=2;
                        queue.add(new Point(nx,ny,a.cho+1,direction));
                        bam.add(new Point(nx,ny,a.cho+1,direction));
                    }
                }else if(hashMap.get(a.cho).equals("L")){
                    int direction = a.direction;
                    if(direction>0){
                        direction -= 1;
                    }else{
                        direction -= 1;
                        direction = 4-(Math.abs(direction)%4);
                    }
                    if(dummy[nx][ny]==1){
                        dummy[nx][ny]=2;
                        queue.add(new Point(nx,ny,a.cho+1,direction));
                        bam.add(new Point(nx,ny,a.cho+1,direction));
                    }else{
                        dummy[bam.get(0).x][bam.get(0).y]=0;
                        bam.remove(0);
                        dummy[nx][ny]=2;
                        queue.add(new Point(nx,ny,a.cho+1,direction));
                        bam.add(new Point(nx,ny,a.cho+1,direction));
                    }
                }
            }else{
                if(dummy[nx][ny]==1){
                    dummy[nx][ny]=2;
                    queue.add(new Point(nx,ny,a.cho+1,a.direction));
                    bam.add(new Point(nx,ny,a.cho+1,a.direction));
                }else{
                    dummy[bam.get(0).x][bam.get(0).y]=0;
                    bam.remove(0);
                    dummy[nx][ny]=2;
                    queue.add(new Point(nx,ny,a.cho+1,a.direction));
                    bam.add(new Point(nx,ny,a.cho+1,a.direction));
                }
            }
        }
    }


}
