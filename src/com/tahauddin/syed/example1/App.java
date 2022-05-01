package com.tahauddin.syed.example1;


public class App {

    public static void main(String[] args) {

        Printer instance1 = Printer.getInstance();
        Printer instance2 = Printer.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        if(instance1.hashCode() == instance2.hashCode()){
            System.out.println("Only One Object");
        }
    }
}
