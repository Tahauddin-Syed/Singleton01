package com.tahauddin.syed.example7;

/**
 * this is inner class single ton example
 * we are directly assigning the value of INSTANCE to new Printer();
 * but it will not be eager instantization,
 * object will be created when we call the getInstance().
 * internally it will call InnerPrinter class and from there object will be created.
 */
public class Printer {

    private Printer(){
        System.out.println("0 Param Constructor");
    }

    public static Printer getInstance(){
        return InnerPrinter.INSTANCE;
    }

    /**
     * this is used instead of double  null check.
     * we can write in simple way by writing this variable in Innerclass
     * and then when ever getInstance() is called, object will be created.
     */
    private static class InnerPrinter{
        // volatile keyword will do everything in one step
        // or do nothing in one step.
        private static volatile Printer INSTANCE = new Printer();
    }
}
