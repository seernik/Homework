package com.company.lesson5;

public class StringArray11 {
    public static void main(String[] args) {
        String [][] str = new String[3][6];
        char ch ='a';
        for (int i=0;i<3;i++){
            for (int j=0;j<6;j++) {
               str[i][j] = ch + "" + (j + 1);
                }
            ch++;
            }
        for (int i=0;i<3;i++){
                for (int j=0;j<6;j++){
                    System.out.print(str[i][j]+" ");
                }
                System.out.println();
            }
        }
    }


