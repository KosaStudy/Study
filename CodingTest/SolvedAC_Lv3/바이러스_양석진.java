package CodingTest.SolvedAC_Lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class 바이러스_양석진 {

    static ArrayList<ArrayList<Integer>> network;
    static int[] virus;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();

        network = new ArrayList<>();
        for (int x = 0; x <= n; x++) {
            network.add(new ArrayList<>());
        }

        for (int x = 0; x < v; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            network.get(a).add(b);
            network.get(b).add(a);
        }
        count = 0;
        virus = new int[n + 1];
        dfs(1);
        System.out.println(count);
    }

    static void dfs(int start) {
        virus[start] = 1;

        for (int x : network.get(start)) {
            if (virus[x] == 1) continue;
            count++;
            dfs(x);
        }
    }

}