package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b5052 {
    public static void main(String[] args) throws IOException {
        final String YES = "YES";
        final String NO = "NO";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> phoneNumbers = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            phoneNumbers.clear();
            boolean check = false;
            for(int i=0;i<N;i++){
                phoneNumbers.add(br.readLine());
            }

            Collections.sort(phoneNumbers);

            for(int i = 0; i<N-1;i++){
                if(phoneNumbers.get(i+1).startsWith(phoneNumbers.get(i))){
                    check = true;
                }
            }

            sb.append(check ? NO : YES).append("\n");
        }
        System.out.println(sb);
    }
}
