package com.tahauddin.syed.example8;

/**
 * this is example of cloneable,
 * if the Singleton class implements CLoneable,
 * then we can call clone() and create new method of it.
 *
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Printer instance1 = Printer.getInstance();
        Printer instance2 = Printer.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        Object clone1 = instance1.clone();
        Object clone2 = instance2.clone();

        System.out.println(clone1.hashCode());
        System.out.println(clone2.hashCode());
    }
}
