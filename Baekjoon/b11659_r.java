package Baekjoon;
import java.util.Scanner;
import java.util.stream.IntStream;

public class b11659_r {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr1 = IntStream.range(0,N).map(i->sc.nextInt()).toArray();

        int[] arr2 = new int[N];
        IntStream.range(0,N).forEach(i->arr2[i] = (i==0) ? arr1[i] : arr2[i-1] + arr1[i]);

        IntStream.range(0,M).forEach(i->{
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            System.out.println((start == 0) ? arr2[end] : arr2[end] - arr2[start-1]);
        });
    }
}
