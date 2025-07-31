package com.vaishnavi.practice.garbageCollector;

public class GCDemo {

    public static void main(String[] args) {
        GCDemo obj = new GCDemo(); // Object created
        obj = null; // Object becomes eligible for garbage collection

        System.gc(); // Suggest JVM to run GC
    }

//    @Override
//    protected void finalize() {
//        System.out.println("Object is garbage collected");
//    }
}
