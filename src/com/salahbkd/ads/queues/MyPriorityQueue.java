package com.salahbkd.ads.queues;

import java.util.Arrays;

public class MyPriorityQueue {
    private int[] items = new int[5];
    private int count;

    // O(n)
    public void add(int item) {
        if (isFull())
            throw new IllegalStateException();

        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public boolean isFull() {
        return count == items.length;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    // O(1)
    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
//	private int[] items;
//	private int count = 0;
//	private int lastIndex = 0;
//	private int tempIndex = 0;
//	private int front;
//	
//	public MyPriorityQueue(int size) {
//		items = new int[size];
//	}
//	
//	// O(n)
//	public void enqueue(int item) {
//		
//		if(isFull()) 
//			throw new IllegalStateException();
//		if(count == 0)
//			front = 0;
//		
//		if(item > items[lastIndex]) {
//			items[count] = item;
//			lastIndex = count;
//			count++;
//			
//		} else {
//			for(int i = lastIndex; i >= 0; i--) {
//				if(items[i] > item) {
//					items[i + 1] = items[i];
//					tempIndex = i;
//				}
//			}
//			items[tempIndex] = item;
//			front = lastIndex;
//			count++;
//		}
//	}
//
//	// O(1)
//	public int remove() {
//		if (isEmpty())
//	      throw new IllegalStateException();
//		
//		int temp = items[front];
//		items[front] = 0;
//		front = front + 1;
//		count--;
//		return temp;
//	}
//	
//	public boolean isEmpty() {
//		return count == 0;
//	}
//	  
//	private boolean isFull() {
//		return count == items.length;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return Arrays.toString(items);
//	}
}
