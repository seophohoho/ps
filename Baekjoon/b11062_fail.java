package Baekjoon;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class b11062 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int wave;
        Deque<Integer> cards = new ArrayDeque<>();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            for(int j=0;j<N;j++){
                cards.add(sc.nextInt());
            }
            wave = 1;
            int result = 0;
            while(!cards.isEmpty()){
                int value = 0;

                if(cards.getFirst() >= cards.getLast()){
                    value = cards.pollFirst();
                }else if(cards.getFirst() <= cards.getLast()){
                    value = cards.pollLast();
                }

                if(wave % 2 == 1){
                    result+=value;
                }
                wave++;
            }
            System.out.println(result);
            cards.clear();
        }
    }
}
