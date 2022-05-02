package com.tahauddin.syed.example9;

public class Printer {


    /**
     * checking if the INSTANCE is null or not,
     * if INSTANCE is not null, which means object is already created, then throwing exception,
     * else allowing to create object.
     */
    private Printer(){
        if(null != InnerPrinter.INSTANCE){
            System.out.println("Cannot Create Another Object of it.");
            throw new RuntimeException("Object already Created..");
        }

        System.out.println("0 Param Constructor :: ");
    }


    public static Printer getInstance(){
        return InnerPrinter.INSTANCE;
    }


    private static class InnerPrinter{
        private static volatile  Printer INSTANCE = new Printer();

    }

}
