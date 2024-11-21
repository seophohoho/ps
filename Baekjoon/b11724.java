package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b11724 {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            String[] UV = br.readLine().split(" ");
            int U = Integer.parseInt(UV[0]);
            int V = Integer.parseInt(UV[1]);
            graph.get(U).add(V);
            graph.get(V).add(U);
        }

        visited = new boolean[N+1];
        int result = 0;

        for(int i=1;i<=N;i++){
            if(!visited[i]){
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }
    private static void dfs(int node){
        visited[node] = true;
        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }
}
