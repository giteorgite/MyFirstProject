package com.example;

/**
 * Created by George on 12/28/2016.
 * Now with an update
 */
public class Loop {
    public static void main (String[] args){
        int x =1;
        System.out.println("This is before the loop");
        while (x<4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x=x+1;
        }
        System.out.println("This is after the loop");
    }
}

