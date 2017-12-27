package com.company.lesson5;

public class DaysOfWeek1 {
    public static void main(String[] args) {
        String str = args[0];
        int i = Integer.parseInt(str);
        if (i > 0 && i < 8) {
            if (i == 1) {
                System.out.println("Понедельник");
            } else if (i == 2) {
                System.out.println("Вторник");
            } else if (i == 3) {
                System.out.println("Среда");
            } else if (i == 4) {
                System.out.println("Четверг");
            } else if (i == 5) {
                System.out.println("Пятница");
            } else if (i == 6 || i == 7) {
                System.out.println("Выходной");
            }
        } else {
            System.out.println("Данные за пределом диапазона");
        }
    }
}
