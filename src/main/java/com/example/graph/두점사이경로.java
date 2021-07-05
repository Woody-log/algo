package com.example.graph;

import java.util.LinkedList;

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;

        Node(int data) {
            this.data = data;
            this.adjacent = new LinkedList<>();
            this.marked = false;
        }
    }

    Node[] nodes;

    Graph(int size) {
        nodes = new Node[size];
        for(int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    boolean search(int start, int end) {
        return search(nodes[start], nodes[end]);
    }

    boolean search(Node start, Node end) {

        LinkedList<Node> q = new LinkedList<>();
        start.marked = true;
        q.add(start);

        while(!q.isEmpty()) {
            Node root = q.removeFirst();
            if(root == end) return true;

            for(Node n : root.adjacent) {
                if(n.marked == false ) {
                    n.marked = true;
                    q.add(n);
                }
            }
        }

        return false;
    }
}

/*

    0
   /
  1 -- 3    7
  |  / | \ /
  | /  |  5
  2 -- 4    \
             6 -- 8
 */
public class 두점사이경로 {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);

        System.out.println(g.search(1, 8));
    }
}
