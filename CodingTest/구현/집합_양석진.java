package CodingTest.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 집합_양석진 {

    static ArrayList<Integer> list;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String input = st.nextToken();
            int x;

            switch (input) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    if (!list.contains(x)) {
                        list.add(x);
                    }

                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());

                    if (list.contains(x)) {
                        int idx = list.indexOf(x);
                        list.remove(idx);
                    }
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());

                    if (list.contains(x)) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());

                    if (list.contains(x)) {
                        int idx = list.indexOf(x);
                        list.remove(idx);
                    } else {
                        list.add(x);
                    }
                    break;
                case "all":
                    list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
                    break;
                case "empty":
                    list = new ArrayList<>();
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}