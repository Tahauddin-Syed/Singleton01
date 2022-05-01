package com.tahauddin.syed.example4;

/**
 * multi threading environment.
 */
public class Printer {

    private static Printer INSTANCE;

    private Printer(){
        System.out.println("0 Param Constructor");
    }


    /**
     * in multi threading scenerio, there might be chances
     * that multi threads can enter this method.
     * to overcome from this, restricting only 1 thread to create the object
     * and then allowing others to wait.
     * @return
     */
    public static Printer getInstance(){
        synchronized (Printer.class){
            if(null == INSTANCE){
                INSTANCE = new Printer();
            }
        }
        return INSTANCE;
    }




}
