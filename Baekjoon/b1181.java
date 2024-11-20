package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class b1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> wordsSet = new HashSet<>();

        for(int i=0;i<N;i++){
            wordsSet.add(br.readLine());
        }

        List<String> wordsList = new ArrayList<>(wordsSet);

        Collections.sort(wordsList,(a,b)->{
            if(a.length() != b.length()){
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });

        for(String word : wordsList){
            System.out.println(word);
        }
    }
}
