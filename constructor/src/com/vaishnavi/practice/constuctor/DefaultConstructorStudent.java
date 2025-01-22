package com.vaishnavi.practice.constuctor;

public class DefaultConstructorStudent {
    int id;
    String name;
    //method to display the value of id and name
    void display(){System.out.println(id+" "+name);}

    public static void main(String[] args){
//creating objects
        DefaultConstructorStudent s1=new DefaultConstructorStudent();
        DefaultConstructorStudent s2=new DefaultConstructorStudent();
//displaying values of the object
        s1.display();
        s2.display();
    }
}
