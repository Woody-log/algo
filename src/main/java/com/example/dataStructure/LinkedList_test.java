package com.example.dataStructure;

class Node<T> {
    T data;
    Node next;
    public Node(T data) {
        this.data = data;
    }

    void append(T data) {
        Node<T> end = new Node<>(data);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    void delete(T data) {
        Node n = this;
        while(n.next != null) {
            if(n.next.data == data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = this;
        while(n.next != null) {
            System.out.print(n.data + " => ");
            n = n.next;
        }

        System.out.println(n.data);
    }
}
public class LinkedList_test {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        head.delete(2);
        head.delete(3);
        head.retrieve();
    }
}
