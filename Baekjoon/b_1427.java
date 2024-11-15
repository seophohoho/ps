package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split("");
        List<Integer> nums = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            nums.add(Integer.parseInt(strs[i]));
        }

        Collections.sort(nums,Collections.reverseOrder());

        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i));
        }

    }
}
