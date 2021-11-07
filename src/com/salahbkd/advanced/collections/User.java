package com.salahbkd.advanced.collections;

public class User implements Comparable<User> {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(User other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

}
