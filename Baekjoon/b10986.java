package Baekjoon;
import java.util.Scanner;

public class b10986 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long sumArr[] = new long[N];
        long reminderArr[] = new long[M];
        long result = 0;

        sumArr[0] = sc.nextInt();

        for(int i = 1; i < N; i++) {
            sumArr[i] = sumArr[i - 1] + sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int reminder = (int)(sumArr[i] % M);

            if (reminder < 0) {
                reminder += M;
            }

            if (reminder == 0) result++;

            reminderArr[reminder]++;
        }

        for(int i = 0; i < M; i++) {
            if (reminderArr[i] > 1) {
                result = result + (reminderArr[i] * (reminderArr[i] - 1) / 2);
            }
        }

        System.out.println(result);
    }
}
