package com.java.examples;

public class Diamond3 {

}


class A {
    void add(int a, int b) {

    }
}

class B {
    void add(int a, int b) {

    }
}

class C extends A
{ //If this was possible
    @Override
    void add(int a, int b) { 
        // TODO Auto-generated method stub
        super.add(a, b); //Which version of this, from A or B ?
    }
 }