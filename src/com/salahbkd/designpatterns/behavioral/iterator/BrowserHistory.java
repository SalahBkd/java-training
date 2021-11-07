package com.salahbkd.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> historyList = new ArrayList<>();

    public void push(String history) {
        historyList.add(history);
    }

    public String pop() {
        var lastIndex = historyList.size() - 1;
        var lastItem = historyList.get(lastIndex);
        historyList.remove(lastItem);
        return lastItem;
    }

    /*public Iterator createIterator() {
        return new ListIterator(this);
    }*/

    /*public class ListIterator implements Iterator {
        private BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return this.history.historyList.get(index);
        }

        @Override
        public boolean hasNext() {
            return (index < this.history.historyList.size());
        }
    } */
}
