import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class 셀프넘버_조재룡 {
	static int[] self;
  	public static void main(String[] args) throws IOException {
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  		self = new int[1000000];
  		
  		for(int i=1;i<=10000;i++) {
  			int num = selfNumber(i);
  			self[num] += 1;
  		}
  		
  		for(int i=1;i<10001;i++) {
  			if(self[i]==0) {
  				System.out.println(i);
  			}
  		}
	}
	private static int selfNumber(int i) {
		int sum = i;
		while(i!=0) {
			sum += i%10;
			i /= 10;
		}
		return sum;
	}
	
}