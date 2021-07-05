package com.example.sort;

// nlogn , 최악의 경우 n^2
public class QuickSort {
    static void quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    static void quickSort(int[] array, int start, int end) {
        int part2 = partition(array, start, end);

        if(start < part2 - 1) {
            quickSort(array, start, part2-1);
        }

        if(part2 < end) {
            quickSort(array, part2, end);
        }
    }

    static int partition(int[] array, int start, int end) {
        int pivot = array[(start + end) / 2];

        while(start <= end) {
            while (array[start] < pivot) start++;
            while (pivot < array[end]) end--;

            if(start <= end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] array, int n1, int n2) {
        int temp = array[n1];
        array[n1] = array[n2];
        array[n2] = temp;
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
