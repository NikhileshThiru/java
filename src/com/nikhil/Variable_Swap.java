package com.nikhil;

public class Variable_Swap {

    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x=y;
        y=x;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}