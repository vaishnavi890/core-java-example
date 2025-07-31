package com.vaishnavi.practice.garbageCollector.gc;

public class GCTest {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        p1 = null; // Alice is no longer referenced
        System.gc();
    }
}

