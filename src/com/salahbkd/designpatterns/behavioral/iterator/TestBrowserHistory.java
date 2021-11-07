package com.salahbkd.designpatterns.behavioral.iterator;


public class TestBrowserHistory {
    public static void main(String[] args) {
        var browserHistory = new BrowserHistory();
        browserHistory.push("history1");
        browserHistory.push("history2");
        browserHistory.push("history3");

        // Coupled Solution
        /*for(var i = 0; i < browserHistory.getHistoryList().size(); i++) {
            var item = browserHistory.getHistoryList().get(i);
            System.out.println(item);
        }*/

        // Pattern Approach / Loose coupled solution
        //Iterator iterator = browserHistory.createIterator();
        /*while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }*/
    }
}
