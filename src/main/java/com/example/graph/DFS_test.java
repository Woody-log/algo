package com.example.graph;

import java.util.LinkedList;
import java.util.Stack;

// stack 사용
// 재귀호출 이용
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

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        root.mark = true;
        stack.push(root);

        while(!stack.isEmpty()) {
            Node r = stack.pop();

            for(Node n : r.adjacent) {
                if(n.mark == false) {
                    n.mark = true;
                    stack.push(n);
                }
            }

            visit(r);
        }
    }

    void dfsR(Node r) {
        if(r == null) return ;

        r.mark = true;
        visit(r);

        for(Node n : r.adjacent) {
            if(n.mark == false)  {
                dfsR(n);
            }
        }
    }

    void visit(Node node) {
        System.out.print(node.data + " ");
    }
}
public class DFS_test {
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

        g.dfs();
    }
}
