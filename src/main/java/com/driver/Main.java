package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // This will call the overridden method in class B
    }
}
