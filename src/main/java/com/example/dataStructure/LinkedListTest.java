package com.example.dataStructure;

class LinkedList2 {
    class Node {
        int data;
        Node next;
    }

    Node header;

    LinkedList2() {
        header = new Node();
    }

    public void append(int data) {
        Node end = new Node();
        end.data = data;

        Node n = header;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void delete(int data) {
        Node n = header;

        while(n.next != null) {
            if(n.next.data == data) {
                n.next = n.next.next;
            } else {
                 n = n.next;
            }
        }
    }

    public void retrieve() {
        Node n = header.next;

        while (n.next != null) {
            System.out.print(n.data + " => ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
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
