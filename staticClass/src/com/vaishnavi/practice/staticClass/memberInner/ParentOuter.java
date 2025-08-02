package com.vaishnavi.practice.staticClass.memberInner;

public class ParentOuter {
    private final String message = "Hello from parent outer class";

    class MemberInner {
        void printMessage() {
            System.out.println("message " + message);
        }
    }
}
