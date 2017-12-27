package com.company.lesson5;

public class Factorial {
    public static void main(String[] args) {
        int f;
        f = (int) (Math.random() * 15);
        System.out.println(f + " - Основание факториала. Факториал = " + getFactorio(f));
    }

    private static int getFactorio(int f) {
        int factorio = 1;
        for (int i = 1; i <= f; i++) {
            factorio *= i;
        }
        return factorio;
    }
}
