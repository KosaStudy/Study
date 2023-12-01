import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class 계단오르기_조재룡 {
	static int N;
	static int[] floor;
	static int[][] d;
  	public static void main(String[] args) throws IOException {
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  		N = Integer.parseInt(br.readLine());
  		floor = new int[N+1];
  		d = new int[301][3];
  		for(int i=1;i<=N;i++) {
  			floor[i] = Integer.parseInt(br.readLine());
  		}
  		if(N==1) {
  			System.out.println(floor[1]);
  		}else {
  			d[1][1] = floor[1];
  	  		d[2][1] = floor[2];
  	  		d[2][2] = floor[1]+floor[2];
  	  		
  	  		for(int i=3;i<=N;i++) {
  	  			d[i][1] = Math.max(d[i-2][1], d[i-2][2]) + floor[i];
  	  			d[i][2] = d[i-1][1] + floor[i];
  	  		}
  	  		System.out.println(Math.max(d[N][1], d[N][2]));
  		}
  		
	}
}