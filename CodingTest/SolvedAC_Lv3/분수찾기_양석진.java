package CodingTest.SolvedAC_Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 분수찾기_양석진 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        // 대각선 칸의 갯수, 누적합
        int cross_count = 1, prev_count_sum = 0;

        while(true){
            if(X<= prev_count_sum + cross_count){
                // 대각선의 갯수가 홀수라면, 분자가 큰 수부터 시작
                // 분자는 대각선상 내의 블럭 개수 - (X번째 - 직전 대각선까지의 블럭 개수 - 1)
                // 분모는 X번쨰 - 직전 대각선까지의 블럭 개수
                if(cross_count % 2 == 1){
                    System.out.println((cross_count - (X - prev_count_sum-1))+ "/"+ (X - prev_count_sum));
                    break;
                }
                // 대각선상의 블럭 개수가 짝수라면, 홀수일 떄의 출력을 반대로
                else{
                    System.out.println((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum-1)));
                    break;
                }
            }else{
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}
