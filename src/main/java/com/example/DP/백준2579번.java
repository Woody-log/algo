package com.example.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2579번 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairCount = Integer.parseInt(br.readLine());
        dp = new int[stairCount+1];
        int[] stairScores = new int[stairCount+1];

        for (int i = 1; i <= stairCount; ++i) {
            stairScores[i] = Integer.parseInt(br.readLine());
        }

        int result = solution(stairScores);

        System.out.println(result);
    }

    private static int solution(int[] stairScores) {
        if(stairScores.length == 2) {
            return stairScores[1];
        } else if(stairScores.length ==3) {
            return stairScores[1] + stairScores[2];
        }

        dp[1] = stairScores[1];
        dp[2] = stairScores[1] + stairScores[2];

        for(int i = 3; i < stairScores.length; i++) {
            dp[i] = max(dp[i-2] + stairScores[i], dp[i-3] + stairScores[i] + stairScores[i-1]);
        }

        return dp[stairScores.length-1];
    }

    private static int max(int i, int i1) {
        return i > i1 ? i : i1;
    }
}
