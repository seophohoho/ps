package Baekjoon;

import java.io.*;
import java.util.*;

public class b_1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Element> elements = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            elements.add(new Element(value, i));
        }

        elements.sort(Comparator.comparingInt(e -> e.value));

        int maxMove = 0;
        for (int i = 0; i < N; i++) {
            maxMove = Math.max(maxMove, elements.get(i).originalIndex - i);
        }

        System.out.println(maxMove + 1);
    }
}

class Element {
    int value;
    int originalIndex;

    public Element(int value, int originalIndex) {
        this.value = value;
        this.originalIndex = originalIndex;
    }
}
