package Baekjoon;
import java.util.Scanner;

public class b11659 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for(int i=0;i<N;i++){
            arr1[i] = sc.nextInt();
        }
        arr2[0] = arr1[0];
        for(int i=1;i<N;i++){
            arr2[i] = arr2[i-1] + arr1[i];
        }

        for(int i=0;i<M;i++){
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;

            if(start-1 < 0){
                System.out.println(arr2[end]);
            }else{
                System.out.println(arr2[end]-arr2[start-1]);
            }
        }
    }

}
