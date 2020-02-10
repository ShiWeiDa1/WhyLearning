package com.regan.innerclasses;

/**
 *@className: Callbacks
 *@description:
 *@author: weida.shi
 *@date: 2020/2/3 10:28
 *@version: V1.0
 **/
interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement implements Incrementable {

    @Override
    public void increment() {
        System.out.println("Other increment");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {

    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Clousure implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Clousure();
    }
}

class Caller {
    private Incrementable callbackReference;

    public Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }

    void go() {
        callbackReference.increment();
    }

}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);//Other increment 1
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());//1
        caller1.go();//1
        caller1.go();//2
        caller2.go();//Other increment    2
        caller2.go();//Other increment 3
    }
}