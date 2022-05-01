package com.tahauddin.syed.example5;

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
        // in static methods, we cannot use this in synchronized()
        // we have to pass class name in the form of
        // java.lang.Class
        // Class<Printer> printerClass = Printer.class;
        // this will contain the all meta data of the object
        // this is double null check,
        // when instance is null then only flow will enters in this block
        // hence it will increase performance.
        if (null == INSTANCE) {
            synchronized (Printer.class){
                if(null == INSTANCE){
                    INSTANCE = new Printer();
                }
            }
        }
        return INSTANCE;
    }




}
