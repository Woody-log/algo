package com.example.sort;

public class BubbleSort2 {

    private static void bubbleSort(int[] arr) {
        bubbleSort(arr, arr.length-1);
    }

    private static void bubbleSort(int[] arr, int end) {

        if(end > 0) {
            for(int i = 1; i <= end; ++i) {
                if(arr[i-1] > arr[i] ) {
                    swap(arr, i-1, i);
                }
            }
            bubbleSort(arr, end-1);
        }

    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private static void printArray(int[] arr) {
        for(int data : arr) {
            System.out.print(data + ", ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {16,4,2,1,56,23,3,5};

        bubbleSort(arr);
        printArray(arr);
    }
}
