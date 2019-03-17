package com.company;

public class App {
    void main() {
        sotrudniki();
    }

    void input(String n,int y) {
        int nyear = 2019;
        System.out.println("Name: " + n);
        System.out.println("Age: " + (nyear - y) + "\n");
    }

    void sotrudniki() {
        String[] secondname = {"Johnson","Reynolds","N"};
        int[] year = {1967,1988,1995};
        for (int i = 0; i < 3; i++) {
            input(secondname[i], year[i]);
        }
    }

}
