package com.tahauddin.syed.example6;

import java.io.Serializable;

/**
 * created this class for Serializable,
 * Violatile keyword can also be applied at static variable
 * to create the object at once,
 * do every thing or do nothing,
 * object creation requires object creation, object Initialization and object Assignment
 * all the 3 steps should happen by one thread.
 * we can achieve it by usine voilatile keyword at static variable.
 *
 */
public class Printer implements Serializable {

    private static volatile Printer INSTANCE;

//    public static volatile Printer INSTANCE;


    private Printer(){
        System.out.println("0 Param Constructor");
    }

    private static Printer getInstance(){
        if(null == INSTANCE){
            synchronized (Printer.class){
                if(null == INSTANCE){
                    INSTANCE = new Printer();
                }
            }
        }
        return INSTANCE;
    }
}
