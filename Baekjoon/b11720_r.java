package Baekjoon;
import java.util.Scanner;

public class b11720_r {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        int sum = str.chars().map(item->item-'0').sum();
        System.out.println(sum);
    }
}
