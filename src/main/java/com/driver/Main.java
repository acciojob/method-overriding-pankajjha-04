package com.driver;

// Class A with a method named meth returning a string
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Class B extends class A
class B extends A {
    // Override meth() method from class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Main class to execute and test the classes
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        
        // Task 5: Call the overridden method from obj of class B
        System.out.println(objB.meth()); // This will call the overridden method in class B
    }
}
