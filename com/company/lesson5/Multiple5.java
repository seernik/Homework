package com.company.lesson5;

public class Multiple5 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i + " - Число кратно пяти");
            }
            i++;
        } while (i <= 100);
    }
}
