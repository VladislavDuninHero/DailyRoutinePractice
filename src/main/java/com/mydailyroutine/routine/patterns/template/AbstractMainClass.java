package com.mydailyroutine.routine.patterns.template;

public abstract class AbstractMainClass {
    void templateMethod() {
        System.out.println("mount header");
        differ();
        System.out.println("mount footer");
    }

    abstract void differ();
}
