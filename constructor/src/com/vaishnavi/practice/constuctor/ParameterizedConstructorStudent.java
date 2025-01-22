package com.vaishnavi.practice.constuctor;

public class ParameterizedConstructorStudent {
    int id;
    String name;
    //creating a parameterized constructor
    ParameterizedConstructorStudent(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String[] args){
        //creating objects and passing values
        ParameterizedConstructorStudent s1 = new ParameterizedConstructorStudent(111,"Karan");
        ParameterizedConstructorStudent s2 = new ParameterizedConstructorStudent(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}

