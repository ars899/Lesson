package com.company;

public class MathApp {
    void math() {
        int i,j;
        for (i=0;i<10;i++) {
            for (j=0;j<10;j++) {
                System.out.print(j + "*" + i + "=" + (i*j) + " ");
                if ( i*j < 10 ) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}