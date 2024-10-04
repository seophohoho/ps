package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class b1874 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int N = sc.nextInt();
        int inputs[] = new int[N];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<N;i++){
            inputs[i] = sc.nextInt();
        }

        int currentNum=1;

        for(int i=0;i<N;i++){
            int target = inputs[i];

            while(currentNum <= target){
                stack.push(currentNum);
                currentNum++;
                result.append("+\n");
            }

            if(stack.peek() == target){
                stack.pop();
                result.append("-\n");
            }else{
                System.out.println("NO");
                return;
            }
        }

        System.out.println(result.toString());
    }
}
