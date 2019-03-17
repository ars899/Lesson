package com.company;

public class MathApp {
    void math() {
        int i,j;
        for (i=0;i<10;i++) {
            for (j=0;j<10;j++) {
                if (i*j == 0){

                } else
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }
            System.out.println(" ");
        }
    }
}