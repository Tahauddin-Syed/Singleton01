package com.tahauddin.syed.example7;

public class PrinterFactory implements Runnable{

    @Override
    public void run() {
        Printer instance1 = Printer.getInstance();
        System.out.println("Instance Has Code :: " + instance1.hashCode());
        for (int i = 0; i < 100; i++) {
            System.out.println(" Value is :: " + i);
        }
    }
}
