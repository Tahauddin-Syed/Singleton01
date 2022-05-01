package com.tahauddin.syed.example2;

public class App {

    public static void main(String[] args) {
        Printer instance1 = Printer.getInstance();
        Printer instance2 = Printer.getInstance();

        int hashCode1 = instance1.hashCode();
        int hashCode2 = instance2.hashCode();
        System.out.println(hashCode1 + " :: " + hashCode2);

        if(hashCode1 == hashCode2){
            System.out.println("Same Object");
        }
    }
}
