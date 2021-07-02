package com.example.main;

public class main {
    public static void main(String[] args) {

    }

    // O(1)
    public boolean function1(int [] n) {
        return (n[0] == 0) ? true : false;
    }

    // O(n)
    public void function2(int [] n ) {
        for(int i = 0; i < n.length; ++i) {
            System.out.println(i);
        }
    }

    // O(n 제곱)
    public void function3(int [] n ) {
        for(int i = 0; i < n.length; ++i) {
            for(int j = 0; j < n.length; ++j) {
                System.out.println(i + j);
            }
        }
    }

    // O(nm)
    public void function4(int [] n, int [] m ) {
        for(int i = 0; i < n.length; ++i) {
            for(int j = 0; j < m.length; ++j) {
                System.out.println(i + j);
            }
        }
    }

    // O(n 3제곱)
    public void function5(int [] n ) {
        for(int i = 0; i < n.length; ++i) {
            for(int j = 0; j < n.length; ++j) {
                for(int k = 0; j < n.length; ++j) {
                    System.out.println(i + j + k);
                }
            }
        }
    }

    // O(2 n제곱) - 피보나치수 수열 => n 제곱, n 3제곱 보다 느림
    public int function6(int n , int [] r) {
        if(n <= 0) return 0 ;
        else if(n == 1) return r[n] = 1;
        return r[n] = function6(n-1, r) + function6(n-2, r);
    }

    // log(n) ->
    public int function7 (int k, int[] arr, int start, int end) {
        if(start > end) return -1;

        int m = (start + end) / 2;
        if(arr[m] == k)
            return m;
        else if(arr[m] > k )
            return function7(k, arr, start, m-1);
        else
            return function7(k, arr, m+1, end);
    }

    // O(spart(n))
}
