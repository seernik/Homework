package com.company.lesson3;

import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (sc.hasNextLong()) {
            long i = sc.nextLong();
            if (i % 2 == 0) {
                System.out.println(i + " Четное");
            } else {
                System.out.println(i + " Нечетное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}

