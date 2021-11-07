package com.salahbkd.ads.queues;

import java.util.Stack;

public class QueueStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void enqueu(int item) {
        stack1.push(item);
    }

    public int dequeu() {
        if (isEmpty())
            throw new IllegalAccessError();

        reverseStack1();

        return stack2.pop();
    }

    private void reverseStack1() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
    }

    public boolean isEmpty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalAccessError();

        reverseStack1();
        return stack2.peek();
    }

}
