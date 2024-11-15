package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<>();

        String[] strs = br.readLine().split(" ");

        int N = Integer.parseInt(strs[0]);
        int targetIdx = Integer.parseInt(strs[1]);

        String[] numStrs = br.readLine().split(" ");

        for(int i=0;i<N;i++){
            nums.add(Integer.parseInt(numStrs[i]));
        }

        Collections.sort(nums);

        System.out.println(nums.get(targetIdx-1));
    }
}
