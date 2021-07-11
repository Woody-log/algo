package com.example.DP;

public class 피보나치 {
    // 일반적인 재귀방법
    public static int fibo(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return fibo(n-1) + fibo(n-2);
    }

    static int[] fiboarray = new int[100];

    // 메모이제이션
    public static int fibo2(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(fiboarray[n] != 0 ) return fiboarray[n];
        return fiboarray[n] = fibo2(n-1) + fibo2(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fibo(20));
        System.out.println(fibo2(20));
    }
}
