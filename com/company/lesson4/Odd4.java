package com.company.lesson4;

public class Odd4{
        public static void main(String[] args) {
            String str = args[0];
            int i = Integer.parseInt(str);
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
}

