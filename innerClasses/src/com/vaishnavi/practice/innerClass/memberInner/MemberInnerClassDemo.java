package com.vaishnavi.practice.innerClass.memberInner;

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        ParentOuter parentOuter = new ParentOuter();
        ParentOuter.MemberInner memberInner = parentOuter.new MemberInner();

        memberInner.printMessage();
    }
}

