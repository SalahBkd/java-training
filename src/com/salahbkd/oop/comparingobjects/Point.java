package com.salahbkd.oop.comparingobjects;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // comparing object to itself.
        if (this == obj) return true;

        if (!(obj instanceof Point))
            return false;

        Point tempPoint = (Point) obj;
        return this.x == tempPoint.x && this.y == tempPoint.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}
