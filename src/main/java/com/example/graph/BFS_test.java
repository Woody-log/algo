package com.example.graph;
/*
import java.util.LinkedList;
import java.util.Queue;

// queue 사용

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean mark;

        Node(int data) {
            this.data = data;
            this.adjacent = new LinkedList<>();
            this.mark = false;
        }
    }

    Node [] nodes;

    Graph(int size) {
        nodes = new Node[size];
        for(int i = 0; i < size; ++i) {
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

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.mark = true;
        while (!queue.isEmpty()) {
            Node r = queue.remove();
            for(Node n : r.adjacent) {
                if(n.mark == false) {
                    n.mark = true;
                    queue.add(n);
                }
            }

            visit(r);
        }
    }

    void visit(Node node) {
        System.out.print(node.data + " ");
    }
}
public class BFS_test {
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

        g.bfs(3);
    }
}*/
