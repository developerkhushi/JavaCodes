package com.dsa.linkedlist;

class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    public ListNode (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    ListNode head;

    public void insertAtHead(int data) {
        ListNode newNode = new ListNode(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    public void insertAtPosition(int pos, int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) head = newNode;

        if (pos == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        ListNode curr = head;
        int index = 0;
        while (curr != null && index < pos - 1) {
            curr = curr.next;
            index++;
        }

        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }
        curr.next = newNode;
    }

    public void delete(int key) {
        ListNode temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == head)
            head = temp.next;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    public void printForward() {
        ListNode curr = head;
        System.out.print("Forward: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtHead(2);
        dll.insertAtEnd(10);
        dll.insertAtHead(5);
        dll.delete(2);
        dll.printForward();
        dll.insertAtEnd(2);
        dll.insertAtPosition(2, 6);
        dll.printForward();
    }
}
