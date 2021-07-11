package com.example.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    int s;
    int e;
    int v;

    Node(int s, int e, int v) {
        super();
        this.s = s;
        this.e = e;
        this.v = v;
    }
    @Override
    public int compareTo(Node o) {
        return o.v >= v ? -1 : 1;
    }
}

public class 최소신장트리 {
    public static int getParent(int[] parent,  int x) {
        if(parent[x] == x) return x;
        else return parent[x] = getParent(parent, parent[x]);
    }

    public static void unionParent(int[] parent, int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);
        if(a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static boolean isEqualParent(int[] parent, int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);
        return a == b ? true : false;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());

        int[] parent = new int[node];

        for(int i = 0; i < node; i++) {
            parent[i] = i;
        }

        PriorityQueue<Node> q = new PriorityQueue<>();

        for(int i = 0 ; i < edge; i++) {
            String[] line = br.readLine().split(" ");
            q.add(new Node(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])));
        }

        int sum = 0;
        for(int i = 0; i < node; i++) {
            Node n = q.poll();
            if(!isEqualParent(parent, n.s - 1, n.e -1)) {
                sum += n.v;
                unionParent(parent, n.s-1 , n.e-1);
            }
        }

        System.out.println(sum);
    }
}
