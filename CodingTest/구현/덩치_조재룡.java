import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class 덩치_조재룡 {

    static String word;
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine();
        list.add("c=");
        list.add("c-");
        list.add("dz=");
        list.add("d-");
        list.add("lj");
        list.add("nj");
        list.add("s=");
        list.add("z=");
        int cnt = 0;
        for(int i=0;i<word.length();){
            String a = "";
            String b = "";
            if(i<=word.length()-3){
                a = word.substring(i,i+3);
                if(list.contains(a)){
                    cnt+=1;
                    i+=3;
                    continue;
                }
            }
            if(i<=word.length()-2){
                b = word.substring(i,i+2);

                if(list.contains(b)){
                    cnt += 1;
                    i+=2;
                    continue;
                }
            }
            cnt+=1;
            i++;
        }
        System.out.println(cnt);
    }

}
