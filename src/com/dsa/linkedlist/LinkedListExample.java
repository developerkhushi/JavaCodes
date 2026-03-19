package com.dsa.linkedlist;

class Node {
    int data;
    Node next;

    public Node (int data) {
        this.data = data;
    }
}

public class LinkedListExample {

    private Node head;
    private int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertNode(int position, int value) {
        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        }

        Node newNode = new Node(value);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteNode(int position) {

        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        }

        if (position == 0) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }
        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Invalid position: " + position);
        }
        current.next = current.next.next;
        size--;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();
        int pos = 4, data = 8;
        list.insertNode(pos, data);
        list.printList();
        list.deleteNode(pos);
        list.printList();
        System.out.print(list.size());
    }
}
