import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class 방번호_조재룡 {
   
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[10];
        for(int i=0;i<s.length();i++) {
        	int a = s.charAt(i) - '0';
        	if(a==9) arr[6] +=1;
        	else arr[a] += 1;
        }
        
        if(arr[6]%2==0) arr[6] = arr[6]/2;
        else arr[6] = arr[6]/2 +1;
        int max = 0;
        for(int i=0;i<9;i++) {
        	max = Math.max(arr[i], max);
        }
        
        System.out.println(max);
        
    }
}