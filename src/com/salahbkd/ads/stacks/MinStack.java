package com.salahbkd.ads.stacks;

public class MinStack {

    private MyStack stack = new MyStack(5);
    private MyStack mins = new MyStack(5);

    public void push(int item) {
        stack.push(item);

        if (mins.isEmpty())
            mins.push(item);

        else if (item < mins.peek())
            mins.push(item);
    }

    public int pop() {
        if (stack.isEmpty())
            throw new IllegalStateException();

        int top = stack.pop();
        if (top == mins.peek())
            mins.pop();
        return top;
    }

    public int min() {
        return mins.peek();
    }

}
