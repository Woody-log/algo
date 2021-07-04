package com.example;



/*
   (1)
 (2)  (3)
(4)(5)

Inorder (Left, Root, Right) : 4 2 5 1 3
PreOrder (Root, Left, Right) : 1 2 4 5 3
PostOrder (Left, Right, Root) : 4 5 2 3 1
*/

class Node {
    int data;
    Node left;
    Node right;
}

class Tree {
    Node root;
    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    public Node makeNode(Node left, int data, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }

    public void inorder(Node node) {
        if(node != null) {
            inorder(node.left);
            System.out.print(node.data);
            inorder(node.right);
        }
    }

    public void preorder(Node node) {
        if(node != null) {
            System.out.print(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postodder(Node node) {
        if(node != null) {
            postodder(node.left);
            postodder(node.right);
            System.out.print(node.data);
        }
    }
}
public class 트리 {
}
