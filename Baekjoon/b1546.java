package Baekjoon;
import java.util.Scanner;

public class b1546 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = new int[N];

        for(int i=0;i<N;i++) {
            score[i] = sc.nextInt();
        }

        double max = score[0];

        for(int i=0;i<N;i++){
            if(max < score[i]){
                max = score[i];
            }
        }

        double sum = 0;
        for(int i=0;i<N;i++){
            sum += score[i]/max*100.0;
        }

        System.out.println(sum/N);

    }
}
