package com.salahbkd.ads.linkedlists;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        Node tempNode = new Node(item);

        if (isEmpty()) {
            first = tempNode;
            last = tempNode;
        } else {
            last.next = tempNode;
            last = tempNode;
        }
        size++;
    }

    public void addFirst(int item) {
        Node tempNode = new Node(item);

        if (isEmpty()) {
            first = tempNode;
            last = tempNode;
        } else {
            tempNode.next = first;
            first = tempNode;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        Node tempNode = first;
        while (tempNode != null) {
            if (tempNode.value == item)
                return index;
            tempNode = tempNode.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (first == last) {
            first = last = null;
        } else {
            Node tempNode = first.next;
            first.next = null;
            first = tempNode;
        }
        size--;
    }

    public void deletelast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (first == last) {
            first = last = null;
        } else {
            // get the previous node
            Node tempNode = first;
            while (tempNode != null) {
                if (tempNode.next == last) break;
                tempNode = tempNode.next;
            }
            // unlink the node
            tempNode.next = null;
            last = tempNode;
        }
        size--;
    }

    public int size() {
        return size;
    }


    public void reverse() {
        if (isEmpty()) return;
        Node current = first.next;
        Node beforeCurrent = first;
        while (current != null) {
            Node nextOfCurrent = current.next;
            current.next = beforeCurrent;
            beforeCurrent = current;
            current = nextOfCurrent;
        }
        last = first;
        last.next = null;
        first = beforeCurrent;
    }

    public int getKthLastNode(int k) {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node head = first;
        Node second = first;

        for (int i = 0; i < k - 1; i++) {
            second = second.next;
            if (second == null)
                throw new IllegalArgumentException();
        }

        while (second != last) {
            second = second.next;
            head = head.next;
        }

        return head.value;
    }

    public void printMiddle() {
        Node firstL = first;
        Node second = first;
        while (second != last && second.next != last) {
            second = second.next.next;
            firstL = firstL.next;
        }
        if (second == last) {
            System.out.println(firstL.value);
        } else {
            System.out.println("Two middle nodes: " + first.value + " " + firstL.next.value);
        }
    }

    public boolean hasALoop() {
        produceAloop();
        Node a = first;
        Node b = first;

        while (a != null) {
            a = a.next.next;
            b = b.next;
            if (a == b)
                return true;
        }
        return false;
    }

    private void produceAloop() {

        last.next = first;
        //loop with last pointer to node 3 9bal last
		Node temp = first;
		while(temp.next != last) {
			temp = temp.next;
		}
		Node temp2 = first;
		while(temp2.next != temp) {
			temp2 = temp2.next;
		}
		last.next = temp2;
    }


}
