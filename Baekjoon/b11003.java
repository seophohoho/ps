package Baekjoon;

import java.io.*;
import java.util.*;

public class b11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> deque = new LinkedList<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - L + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && A[deque.peekLast()] > A[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            result.append(A[deque.peekFirst()]).append(" ");
        }
        bw.write(result.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
