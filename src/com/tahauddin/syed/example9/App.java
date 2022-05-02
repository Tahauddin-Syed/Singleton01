package com.tahauddin.syed.example9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * breaking singleton class using reflection api
 *
 */
public class App {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Using Reflection API");

        Printer printer = Printer.getInstance();
        Class<? extends Printer> printerClass = printer.getClass();
        Constructor<?>[] printerConstructors = printerClass.getDeclaredConstructors();
        printerConstructors[0].setAccessible(true);

        Printer printer1 = (Printer) printerConstructors[0].newInstance();
        Printer printer2 = (Printer) printerConstructors[0].newInstance();
        Printer printer3 = (Printer) printerConstructors[0].newInstance();

        // we can see that all the printers has different hascodes.
        // hence more than 1 object are created using reflection api.
        //
        System.out.println(printer.hashCode());
        System.out.println(printer1.hashCode());
        System.out.println(printer2.hashCode());
        System.out.println(printer3.hashCode());


    }

}
