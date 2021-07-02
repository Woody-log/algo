package com.example.dataStructure;


import java.util.NoSuchElementException;

class Quere<T> {

    class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void add(T data) {
        Node<T> node = new Node<T>(data);

        if(last != null) {
            last.next = node;
        }
        last = node;
        if(first == null) {
            first = last;
        }
    }

    public T remove() {
        if(first == null) {
            throw new NoSuchElementException();
        }

        T data = first.data;
        first = first.next;

        if(first == null) {
            last = null;
        }

        return data;
    }

    public T peek() {
        if(first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
public class Queue_test {

}
