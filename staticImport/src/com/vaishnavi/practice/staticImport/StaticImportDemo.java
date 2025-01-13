package com.vaishnavi.practice.staticImport;

import static com.vaishnavi.practice.staticImport.service.HelloService.sayHello;


public class StaticImportDemo {
    public static void main(String[] args) {
        sayHello("vaishnavi");
        sayHello("vaishnavi", "latur");
    }
}
