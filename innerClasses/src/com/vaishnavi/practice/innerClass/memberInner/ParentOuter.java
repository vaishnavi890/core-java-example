package com.vaishnavi.practice.innerClass.memberInner;

public class ParentOuter {
    private String message = "Hello from parent outer class!!";

    class MemberInner {
        void printMessage() {
            System.out.println("msg: " + message);
        }
    }
}
