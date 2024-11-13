package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split(" ");

        List<Integer> times = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            times.add(Integer.parseInt(inputs[i]));
        }

        Collections.sort(times);

        int sum=0;
        int result=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                sum+=times.get(j);
            }
            result += sum;
            sum=0;
        }

        System.out.println(result);
    }
}
