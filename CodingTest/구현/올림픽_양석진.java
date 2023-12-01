package CodingTest.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 올림픽_양석진 {

    static int N, K;
    static ArrayList<Node> list = new ArrayList<>();
    static int end_point = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            list.add(new Node(country, gold, silver, bronze, 0));
        }

        // sort를 하면 뭐를 기준으로 sort가 되는거지?
        // 오름차순으로 숫자 > 대문자 > 소문자 > 한글순으로 정렬
        Collections.sort(list);
        // 정렬을 했으니 첫번째 국가는 무조건 1등
        list.get(0).rate = 1;

        for (int x = 1; x < list.size(); x++) {
            int tmp_gold = list.get(x - 1).gold;
            int tmp_silver = list.get(x - 1).silver;
            int tmp_bronze = list.get(x - 1).bronze;
            Node now = list.get(x);
            // 국가의 번호가 K번이면 end_point를 찾고 마지막 정답 출력할 때 사용
            if (list.get(x).num == K) {
                end_point = x;
            }
            // 3가지의 메달이 모두 동일하다면, 비교하는 등수를 같게 해야 한다.
            if (now.gold == tmp_gold && now.silver == tmp_silver && now.bronze == tmp_bronze) {
                list.get(x).rate = list.get(x - 1).rate;
            } else {
                list.get(x).rate = x + 1;
            }
        }
        System.out.println(list.get(end_point).rate);
    }
}

class Node implements Comparable<Node> {
    int num, gold, silver, bronze, rate;

    Node(int num, int gold, int silver, int bronze, int rate) {
        this.num = num;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.rate = rate;
    }

    // 리턴 값이 양수일 때 a > b, 음수 일 때 a < b
    @Override
    public int compareTo(Node o) {
        if (this.gold == o.gold) {
            if (this.silver == o.silver) {
                return o.bronze - this.bronze;
            } else {
                return o.silver - this.silver;
            }
        } else {
            return o.gold - this.gold;
        }
    }
}
