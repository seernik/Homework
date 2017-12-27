package com.company.lesson4;

public class MiddleOfSomes3 {
    public static void main(String[] args) {
        double summ = 0;
        int i = 0;
        for (String str : args) {
            summ += Double.parseDouble(str);
            i++;
        }
        System.out.println(summ / i);
    }
}

