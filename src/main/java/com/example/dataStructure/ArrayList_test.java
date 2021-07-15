package com.example.dataStructure;
class ArrayList<T> {
    Object[] data;
    int size;
    int index;

    public ArrayList() {
        this.size = 1;
        this.data = new Object[this.size];
        this.index = 0;
    }

    public void add(T obj) {
        if(this.index == this.size-1 ) {
            doubling();
        }
        this.data[index] = obj;
        this.index++;
    }

    public void doubling() {
        this.size = this.size *2;
        Object[] newData = new Object[this.size];
        for(int i = 0; i < data.length; ++i) {
            newData[i] = this.data[i];
        }

        this.data = newData;
    }

    public T get(int i) throws Exception {
        if(i > this.index - 1) {
            throw new Exception("ArrayOutOfBoundException");
        }

        if(i < 0) {
            throw new Exception("Negative Value");
        }

        return (T) this.data[i];
    }

    public void remove(int i) throws Exception {
        if(i > this.index - 1) {
            throw new Exception("ArrayOutOfBoundException");
        }

        if(i < 0) {
            throw new Exception("Negative Value");
        }

        for(int x = i; x < this.index; x++) {
            this.data[x] = this.data[x+1];
        }
        index--;
    }
}
public class ArrayList_test<T> {
    public static void main(String[] args) throws Exception{
        ArrayList<String> al = new ArrayList();
        al.add("0");
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add("7");
        al.add("8");
        al.add("9");
        al.add("10");
        al.add("11");
        al.add("12");
        al.add("13");
        al.add("14");

        System.out.println(al.get(5));
        al.remove(5);
        System.out.println(al.get(5));
    }
}
