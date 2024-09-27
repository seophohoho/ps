package Baekjoon;
import java.util.Scanner;

public class b12891 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();

        String str = sc.next();

        int result=0;

        int cntA = sc.nextInt();
        int cntC = sc.nextInt();
        int cntG = sc.nextInt();
        int cntT = sc.nextInt();

        for(int i=0;i<=S-P;i++){
            String subStr = str.substring(i,i+P);

            long resultA = subStr.chars().filter(ch -> ch == 'A').count();
            long resultC = subStr.chars().filter(ch->ch=='C').count();
            long resultG = subStr.chars().filter(ch->ch=='G').count();
            long resultT = subStr.chars().filter(ch->ch=='T').count();

            if(resultA >= cntA && resultC >= cntC && resultG >= cntG && resultT >= cntT){
                result++;
            }
        }

        System.out.println(result);
    }
}
