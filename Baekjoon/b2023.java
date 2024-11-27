package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2023 {
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void findPrimes(int targetNumber, int depth, int maxDepth){
        if(depth == maxDepth){
            System.out.println(targetNumber);
            return;
        }

        for(int i=1;i<=9;i++){
            int newTargetNumber = targetNumber*10+i;
            if(isPrime(newTargetNumber)){
                findPrimes(newTargetNumber,depth+1,maxDepth);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] initPrimes = {2,3,5,7};

        for(int prime: initPrimes){
            findPrimes(prime,1,N);
        }

    }
}
