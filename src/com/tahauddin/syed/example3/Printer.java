package com.tahauddin.syed.example3;

public class Printer {

    // this is eager instantization
    private static Printer INSTANCE = new Printer();

    private Printer(){
        System.out.println("0 Param Constructor");
    }


    public static Printer getInstance(){

        return INSTANCE;
    }




}
