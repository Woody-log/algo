package com.example.dataStructure;

import java.util.NoSuchElementException;

class Stack<T> {
    class Node<T> {
        private T data;
        private Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public void push(T data) {
        Node<T> node = new Node<T>(data);
        node.prev = top;
        top = node;
    }

    public T pop() {
        if(top == null) {
            throw new NoSuchElementException();
        }
        T data = top.data;
        top = top.prev;

        return data;
    }

    public T peek() {
        if(top == null) {
            throw new NoSuchElementException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
public class Stack_test {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }

}
