import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이만들기_조재룡 {
    static int N;
    static int white = 0;
    static int blue = 0;
    static int[][] paper;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N;j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        color(0,0,N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void color(int x, int y, int size) {
        if(colorCheck(x,y,size)){
            if(paper[x][y]==0) white++;
            else blue++;
            return;
        }

        int halfsize = size/2;
        color(x,y,halfsize);
        color(x,y+halfsize,halfsize);

        color(x+halfsize,y,halfsize);
        color(x+halfsize,y+halfsize,halfsize);
    }

    private static boolean colorCheck(int x, int y, int size) {
        int gab = paper[x][y];
        for(int i=x;i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if(gab != paper[i][j]) return false;
            }
        }
        return true;
    }
}