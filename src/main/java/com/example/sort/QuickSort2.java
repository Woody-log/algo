package com.example.sort;

public class QuickSort2 {

    private static void QuickSort(int[] arr) {
        QuickSort(arr, 0, arr.length-1);
    }

    private static void QuickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);

        if(start < part2-1) QuickSort(arr, start, part2-1);

        if(part2 < end) QuickSort(arr, part2, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(pivot < arr[end]) end--;

            while(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    private static void printArray(int[] arr) {
        for(int data : arr) {
            System.out.print(data + ", ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {16,4,2,1,56,23,3,5};

        QuickSort(arr);
        printArray(arr);
    }

}
