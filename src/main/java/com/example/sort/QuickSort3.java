package com.example.sort;

public class QuickSort3 {
    public static void quickSort(int[] arr) {
        quickSort(arr, 0 , arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);

        if(start < part2 -1) {
            quickSort(arr, start, part2 -1);
        }

        if(part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(pivot < arr[end]) end--;

            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    private static void printArray(int[] arr) {
        for(int data : arr) {
            System.out.print(data + ", ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {16,4,2,1,56,23,3,5};

        quickSort(arr);
        printArray(arr);
    }

}
