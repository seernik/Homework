package com.company.lesson4;

import java.util.Scanner;

public class MaxModule {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (sc.hasNextFloat()) {
            long i = sc.nextLong();
            System.out.print("Введите число: ");
            if (sc.hasNextFloat()) {
                long y = sc.nextLong();
                System.out.print("Введите число: ");
                if (sc.hasNextFloat()) {
                    long z = sc.nextLong();
                    i = i > 0 ? i : -i;
                    y = y > 0 ? y : -y;
                    z = z > 0 ? z : -z;
                    if (i >= y && i >= z) {
                        System.out.println(i);
                    } else if (y >= i && y >= z) {
                        System.out.println(y);
                    } else if (z >= i && z >= y) {
                        System.out.println(z);
                    } else {
                        System.out.println("Вы ввели не целое число");
                    }
                } else {
                    System.out.println("Вы ввели не целое число");
                }
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }
    }
}

