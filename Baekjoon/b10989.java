package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10000001];

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            nums[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < nums.length; i++) {
            while (nums[i]-- > 0) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}
