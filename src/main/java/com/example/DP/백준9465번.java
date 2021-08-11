package com.example.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준9465번 {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase; ++i) {
            int n = Integer.parseInt(br.readLine());
            int[][] 스티커 = new int[2][n+1];
            dp = new int[2][n+1];

            for(int j = 0; j < 2; ++j) {
                String[] score = br.readLine().split(" ");
                int k = 1;
                for (String s : score) {
                    스티커[j][k] = Integer.parseInt(s);
                    k+=1;
                }
            }
            int result = solution(스티커);
            sb.append(result + "\n");
        }

        System.out.println(sb.toString());
    }

    private static int solution(int[][] 스티커) {
        int n = 스티커[0].length-1;

        dp[0][1] = 스티커[0][1];
        dp[1][1] = 스티커[1][1];

        for(int i = 2; i <= n; i++) {
            dp[0][i] = max(dp[1][i-1], dp[1][i-2]) + 스티커[0][i];
            dp[1][i] = max(dp[0][i-1], dp[0][i-2]) + 스티커[1][i];;
        }
        return max(dp[0][n], dp[1][n]);
    }

    private static int max(int i, int i1) {
        return i > i1 ? i : i1;
    }
}
