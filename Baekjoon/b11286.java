package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class b11286 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                int absA = Math.abs(a);
                int absB = Math.abs(b);

                if (absA == absB) {
                    return a - b;
                }

                return absA - absB;
            }
        });

        for(int i=0;i<N;i++){
            int x = sc.nextInt();

            if(x == 0){
                Integer item = minHeap.poll();
                if(item == null){
                    item = 0;
                }
                sb.append(item).append("\n");
            }else{
                minHeap.offer(x);
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
