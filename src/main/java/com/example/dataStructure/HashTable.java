package com.example.dataStructure;
import java.util.LinkedList;
public class HashTable {
    class Node {
        String key;
        String value;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;

    HashTable(int size) {
        this.data = new LinkedList[size];
    }

    int getHashCode(String key) {
        int hashCode = 0;
        for(char c : key.toCharArray()) {
            hashCode += c;
        }
        return hashCode;
    }

    int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }

    Node search(LinkedList<Node> list, String key) {
        if(list == null) return null;
        for(Node node : list) {
            if(node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        if(list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = search(list, key);  // 중복키 체크.
        if(node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);   // 중복키에 대해 새로운 값으로 교체.
        }
    }

    String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = search(list, key);
        return node == null ? "Not found" : node.getValue();
    }

    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("sung", "1");
        h.put("jin", "2");
        h.put("hee", "3");
        h.put("min", "4");

        System.out.println(h.get("sung"));
        System.out.println(h.get("jin"));
        System.out.println(h.get("hee"));
        System.out.println(h.get("min"));
    }
}
