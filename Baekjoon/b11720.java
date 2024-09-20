package Baekjoon;
import java.util.Scanner;

public class b11720 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();
        char[] charArr = str.toCharArray();

        int sum = 0;
        for(int i=0;i<N;i++){
            sum += charArr[i]-'0';
        }

        System.out.println(sum);
    }
}
