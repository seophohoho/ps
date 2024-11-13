package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b2587 {
    private static final int MAX_N = 5;
    private static final int RESULT_IDX = 2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = new ArrayList<>();

        int avg = 0;

        for(int i=0;i<MAX_N;i++){
            int num = Integer.parseInt(br.readLine());
            avg+= num;
            nums.add(num);
        }

        Collections.sort(nums);

        System.out.println(avg/MAX_N);
        System.out.println(nums.get(RESULT_IDX));
    }
}
