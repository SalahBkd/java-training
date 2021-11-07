package com.salahbkd.advanced.generics;

public class User implements Comparable<User> { // note we are passing User type as argument
    // to avoid explicit casting.
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;
    }

    @Override
    public String toString() {
        return "Points: " + points;
    }
}
