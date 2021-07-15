package com.example.dataStructure;

class ArrayList2 {
    int[] data;
    int size;
    int index;

    ArrayList2() {
        this.size = 1;
        this.index = 0;
        this.data = new int[this.size];
    }

    public void add(int data) {
        if(index == size -1) {
            doubling();
        }

        this.data[index] = data;
        index++;
    }

    public void doubling() {
        this.size = this.size * 2;
        int[] newData = new int[this.size];
        for(int i = 0; i < data.length; i++) {
            newData[i] = this.data[i];
        }

        this.data = newData;
    }

    public void remove(int i) throws Exception {
        if(i > this.index - 1) {
            throw new Exception("ArrayOutOfBoundException");
        }

        if(i < 0) {
            throw new Exception("Negative Value");
        }

        for(int x = i; x < this.data.length; x++) {
            this.data[x] = this.data[x+1];
        }
        index--;
    }

    public int get(int i) throws Exception {
        if(i > this.index - 1) {
            throw new Exception("ArrayOutOfBoundException");
        }

        if(i < 0) {
            throw new Exception("Negative Value");
        }

        return this.data[i];
    }
}
public class ArrayListTest {
}
