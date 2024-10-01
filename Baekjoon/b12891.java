package Baekjoon;
import java.util.Scanner;

public class b12891 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();
        String str = sc.next();

        int result=0;

        int[] inputCnts = new int[4];
        inputCnts[0] = sc.nextInt();
        inputCnts[1] = sc.nextInt();
        inputCnts[2] = sc.nextInt();
        inputCnts[3] = sc.nextInt();

        int[] cnts = new int[4];

        for(int i=0;i<P;i++){
            addChar(cnts,str.charAt(i));
        }

        if(checkValid(cnts,inputCnts)){
            result++;
        }

        for(int i=P;i<S;i++){
            addChar(cnts,str.charAt(i));
            removeChar(cnts,str.charAt(i-P));
            if(checkValid(cnts,inputCnts)){
                result++;
            }
        }

        System.out.println(result);

    }

    private static Boolean checkValid(int[] cnts, int[] inputCnts){
        return cnts[0] >= inputCnts[0] &&
                cnts[1] >= inputCnts[1] &&
                cnts[2] >= inputCnts[2] &&
                cnts[3] >= inputCnts[3];
    }

    private static void addChar(int[] cnts, char c){
        switch(c){
            case 'A':
                cnts[0]++;
                break;
            case 'C':
                cnts[1]++;
                break;
            case 'G':
                cnts[2]++;
                break;
            case 'T':
                cnts[3]++;
                break;
        }
    }

    private static void removeChar(int[] cnts, char c){
        switch(c){
            case 'A':
                cnts[0]--;
                break;
            case 'C':
                cnts[1]--;
                break;
            case 'G':
                cnts[2]--;
                break;
            case 'T':
                cnts[3]--;
                break;
        }
    }
}
