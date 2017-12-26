package com.company.lesson3;

import java.util.Scanner;

public class Summary {

    long y, z;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextLong()) {
            long i = sc.nextLong();
            System.out.print("Введите целое число: ");
            if (sc.hasNextLong()) {
                long y = sc.nextLong();
                System.out.println(i + y);
            } else {
                System.out.println("Вы ввели не целое число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
