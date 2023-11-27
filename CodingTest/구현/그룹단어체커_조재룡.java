import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_조재룡 {
	static int N;
	static int cnt = 0;
  	public static void main(String[] args) throws IOException {
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  		N = Integer.parseInt(br.readLine());
  		
  		for(int i=0;i<N;i++) {
  			String word = br.readLine();
  			groupCheck(word);
  		}
  		System.out.println(N-cnt);
	}
	private static void groupCheck(String word) {
		int[] checkAlphabet = new int[26];
		
		for(int i=0; i<word.length(); i++) {
			int index = word.charAt(i)-'a';
			if(checkAlphabet[index]==0) {
				checkAlphabet[index] += 1;
			}else {
				if(word.charAt(i-1) != word.charAt(i)) {
					cnt++;
					break;
				}
			}
		}
		
	}
}