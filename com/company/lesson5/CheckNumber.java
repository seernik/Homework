package com.company.lesson5;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            if (i <= 10 && i >= 0) {
                System.out.println(i + " Положительное число от нуля до 10");
            } else {
                System.out.println(i + " Число больше 10 или отрицательное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

}
