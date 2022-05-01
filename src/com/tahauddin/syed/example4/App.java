package com.tahauddin.syed.example4;

/**
 * Multi Threading Environment
 * then there will be a possibility  of creating more than 1 singleton java class.
 * to solve this problem we can use synchronized in the Printer class and at the method level
 * or we can only have synchronized block where we are creating the object.
 */
public class App {
    public static void main(String[] args){
        // creating threads..

        PrinterFactory printerFactory = new PrinterFactory();

        Thread thread1 = new Thread(printerFactory);
        Thread thread2 = new Thread(printerFactory);
        Thread thread3 = new Thread(printerFactory);
        Thread thread4 = new Thread(printerFactory);
        Thread thread5 = new Thread(printerFactory);
        Thread thread6 = new Thread(printerFactory);
        Thread thread7 = new Thread(printerFactory);
        Thread thread8 = new Thread(printerFactory);
        Thread thread9 = new Thread(printerFactory);
        Thread thread10 = new Thread(printerFactory);
        Thread thread11 = new Thread(printerFactory);
        Thread thread12 = new Thread(printerFactory);
        Thread thread13 = new Thread(printerFactory);
        Thread thread14 = new Thread(printerFactory);
        Thread thread15 = new Thread(printerFactory);
        Thread thread16 = new Thread(printerFactory);
        Thread thread17 = new Thread(printerFactory);
        Thread thread18 = new Thread(printerFactory);
        Thread thread19 = new Thread(printerFactory);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();
        thread15.start();
        thread16.start();
        thread17.start();
        thread18.start();
        thread19.start();
    }
}
