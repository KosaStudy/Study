import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
 
public class 듣보잡_조재룡 {
   static int N;
   static int M;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        HashSet<String> arr1 = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        
        for(int i=0;i<N;i++) {
        	arr1.add(br.readLine());
        }
        
        for(int i=0;i<M;i++) {
        	String a = br.readLine();
        	if(arr1.contains(a)) {
        		list.add(a);
        		cnt++;
        	}
        }
        
        Collections.sort(list);
        System.out.println(cnt);
        for(String i : list) {
        	System.out.println(i);
        }
        
    }
}