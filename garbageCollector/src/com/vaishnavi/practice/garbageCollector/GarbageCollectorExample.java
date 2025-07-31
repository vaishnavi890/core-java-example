package com.vaishnavi.practice.garbageCollector;

public class GarbageCollectorExample {

    // This method will be called when object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called. Object is garbage collected.");
    }

    public static void main(String[] args) {
        GarbageCollectorExample obj1 = new GarbageCollectorExample();
        GarbageCollectorExample obj2 = new GarbageCollectorExample();

        // Make obj1 and obj2 eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggest JVM to run Garbage Collector
        System.gc();

        System.out.println("Main method completed.");
    }
}

