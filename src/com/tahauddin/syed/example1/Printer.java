package com.tahauddin.syed.example1;

public class Printer {

    private static Printer INSTANCE;

    private Printer(){
        System.out.println("0 Param Constructor");
    }

    /**
     * check if there is only one object.
     * if INSTANCE is already created then return same instance
     * else return new object.
     * @return
     */
    public static Printer getInstance(){
        if(null == INSTANCE){
            INSTANCE = new Printer();
        }
        return INSTANCE;
    }

}
