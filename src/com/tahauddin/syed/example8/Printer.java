package com.tahauddin.syed.example8;

public class Printer implements Cloneable{

    private static volatile Printer INSTANCE = new Printer();

    private Printer(){
        System.out.println("0 Param Constructor ");
    }


    public static Printer getInstance(){
        return INSTANCE;
    }

    // super.clone() will create the new object.
    // this method is available in Object class
    // returns Object class, and we can do type cast to our Printer class.
    @Override
    public Object clone() throws CloneNotSupportedException {

        // we can throw exception if this method is called.
        throw new IllegalArgumentException("Cloneable Not Supported");

        // this will return the same INSTANCE object of it.
        // return INSTANCE;
        // this method will create a new object of it
        // and return the new object
    //    return super.clone();
    }
}
