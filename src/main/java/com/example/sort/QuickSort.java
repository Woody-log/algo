package com.example.sort;

// nlogn , n2
public class QuickSort {
    static void quickSort(int[] arr) {
        quickSort(arr, 0 , arr.length-1);
    }

    static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);

        if(start < part2-1) {
            quickSort(arr, start, part2-1);
        }

        if(part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end) / 2];

        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (pivot < arr[end]) end--;

            // 이부분 주의.
            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    static void swap(int [] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end ] = temp;
    }

    private static void printArray(int[] arr) {
        for(int data : arr) {
            System.out.print(data + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};

        printArray(arr);
        quickSort(arr);
        printArray(arr);
    }
}
