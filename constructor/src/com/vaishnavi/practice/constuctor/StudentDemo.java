package com.vaishnavi.practice.constuctor;

public class StudentDemo {
    int id;
    String name;
    int age;
    //creating two arg constructor
    StudentDemo(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    StudentDemo(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String[] args){
        StudentDemo s1 = new StudentDemo(111,"Karan",21);
        StudentDemo s2 = new StudentDemo(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}

