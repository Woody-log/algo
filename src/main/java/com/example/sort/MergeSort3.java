package com.example.sort;

public class MergeSort3 {

    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
    }

    public static void mergeSort(int[] arr, int[] temp, int s, int e) {
        if(s < e) {
            int m = (s + e) / 2;
            mergeSort(arr, temp, s, m);
            mergeSort(arr, temp, m+1, e);
            merge(arr, temp, s, m, e);
        }
    }

    public static void merge(int[] arr, int[] temp, int s, int m, int e) {
        for(int i = s; i <= e; i++) {
            temp[i] = arr[i];
        }

        int part1 = s;
        int part2 = m + 1;
        int index = s;

        while(part1 <= m && part2 <= e) {
            if(temp[part1] <= temp[part2]) {
                arr[index] = temp[part1];
                part1++;
            } else {
                arr[index] = temp[part2];
                part2++;
            }

            index++;
        }

        for(int i = 0; i <= m - part1; i++) {
            arr[index + i] = temp[part1 + i];
        }
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};

        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }
}
