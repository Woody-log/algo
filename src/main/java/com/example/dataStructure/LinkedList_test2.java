package com.example.dataStructure;

class LinkedList<T> {
    Node<T> header;
    static class Node<T> {
        T data;
        Node next = null;
    }

    LinkedList() {
        header = new Node();
    }


    void append(T data) {
        Node<T> end = new Node<>();
        end.data = data;
        Node n = header;
        while(n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    void delete(T data) {
        Node<T> n = header;
        while(n.next != null) {
            if(n.next.data == data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;
        while(n.next != null) {
            System.out.print(n.data + " => ");
            n = n.next;
        }

        System.out.println(n.data);
    }
}
public class LinkedList_test2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();
        ll.delete(2);
        ll.delete(3);
        ll.retrieve();
    }
}
