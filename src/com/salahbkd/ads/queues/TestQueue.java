package com.salahbkd.ads.queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Stack;

public class TestQueue {

    public static void main(String[] args) {

        MyPriorityQueue queue = new MyPriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(4);
        queue.add(1);
        System.out.println(queue);
        System.out.println(queue.remove());
        //System.out.println(queue.remove());
        // 5, 6, 7

//		QueueStack queueStack = new QueueStack();
//		queueStack.enqueu(10);
//		queueStack.enqueu(20);
//		queueStack.enqueu(30);
//		System.out.println(queueStack.dequeu());
//		System.out.println(queueStack.dequeu());
//		System.out.println(queueStack.dequeu());
//		System.out.println(queueStack.dequeu());
        //System.out.println(queueStack.isEmpty());
        //System.out.println(queueStack.peek());

//		ArrayQueue queue = new ArrayQueue(4);
//		queue.enqueu(10); 
//		queue.enqueu(20);
//		queue.enqueu(30);
//		queue.enqueu(40);
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		System.out.println(queue.print());
//		queue.enqueu(50);
//		System.out.println(queue.print());

//		Queue<Integer> ints = new ArrayDeque<>();
//		ints.add(40);
//		ints.add(50);
//		ints.add(60);
//		System.out.println(ints);
//		//reverse1(ints);
//		reverse2(ints);
    }

    private static void reverse2(Queue<Integer> queue) {
        Queue<Integer> newQueue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            newQueue.add(stack.pop());

        System.out.println(newQueue);
    }

    public static void reverse1(Queue<Integer> queue) {
        Queue<Integer> newQueue = new ArrayDeque<>();
        ArrayList<Integer> elements = new ArrayList<>();
        int counter = 0;

        while (!queue.isEmpty()) {
            elements.add(queue.remove());
            counter++;
        }

        for (int i = counter - 1; i >= 0; i--) {
            newQueue.add(elements.get(i));
        }

        System.out.println(newQueue);
    }

}
