package CodingTest.SolvedAC_Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 그룹단어체커_양석진 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        boolean check = false;
        int count = 0;
        for(int x = 0; x < N; x++){
          check = check();
          if(check) count++;
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        String input = br.readLine();
        int prev = 0;

        // 문자열의 문자가 연속되지 않으면서 이미 앞서 해당 문자가 입력된 적이 있을 경우 그룹 단어가 아니다

        for(int x = 0; x < input.length(); x++){
            int now = input.charAt(x);

            if(prev != now){
                if(check[now - 'a'] == false){
                    check[now - 'a'] = true;
                    prev = now;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}