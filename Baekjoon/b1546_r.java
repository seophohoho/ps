package Baekjoon;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class b1546_r {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();

        double max = Arrays.stream(score).max().orElse(0);
        double avg = Arrays.stream(score).mapToDouble(item -> item / max * 100.0).average().orElse(0);

        System.out.println(avg);
    }
}
