package com.company.lesson4;
import java.util.Scanner;

public class MinModule {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            if (sc.hasNextFloat()) {
                float i = sc.nextFloat();
                System.out.print("Введите число: ");
                if (sc.hasNextFloat()) {
                    float y = sc.nextFloat();
                    System.out.print("Введите число: ");
                    if (sc.hasNextFloat()) {
                        float z = sc.nextFloat();
                        i = i > 0 ? i : -i;
                        y = y > 0 ? y : -y;
                        z = z > 0 ? z : -z;
                        if (i <= y && i <= z) {
                            System.out.println(i);
                        } else if (y <= i && y <= z) {
                            System.out.println(y);
                        } else if (z <= i && z <= y) {
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

