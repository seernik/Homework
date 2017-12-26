package com.company.lesson3;

public class FromTo {

    public static void main(String[] args) {
        boolean bool = true;
        byte byt = 4;
        short shor = 270;
        char ch = '\u9468', ch1 = 4364;
        int integ = 9850;
        long lon = 15686589489l;
        float flo = 5.548f;
        double doub = 516.15648;
        System.out.println("Byte " + byt);
        System.out.print("From Byte to short ");
        System.out.println(GetSHortFromByte(byt));
        System.out.print("From Byte to int ");
        System.out.println(GetIntFromByte(byt));
        System.out.print("From Byte to char ");
        System.out.println(GetCharFromByte(byt));
        System.out.print("From Byte to long ");
        System.out.println(GetLongFromByte(byt));
        System.out.print("From Byte to float ");
        System.out.println(GetFloatFromByte(byt));
        System.out.print("From Byte to double ");
        System.out.println(GetDoubleFromByte(byt));
        System.out.println("Short  " + shor);
        System.out.print("From Short to byte ");
        System.out.println(GetByteFromShort(shor));
        System.out.print("From Short to int ");
        System.out.println(GetIntFromShort(shor));
        System.out.print("From Short to char ");
        System.out.println(GetCharFromShort(shor));
        System.out.print("From Short to long ");
        System.out.println(GetLongFromShort(shor));
        System.out.print("From Short to float ");
        System.out.println(GetFloatFromShort(shor));
        System.out.print("From Short to double ");
        System.out.println(GetDoubleFromShort(shor));
        System.out.println("Int  " + integ);
        System.out.print("From Int to byte ");
        System.out.println(GetByteFromInt(integ));
        System.out.print("From Int to short ");
        System.out.println(GetShortFromInt(integ));
        System.out.print("From Int to char ");
        System.out.println(GetCharFromInt(integ));
        System.out.print("From Int to long ");
        System.out.println(GetLongFromInt(integ));
        System.out.print("From Int to float ");
        System.out.println(GetFloatFromInt(integ));
        System.out.print("From Int to double ");
        System.out.println(GetDoubleFromInt(integ));
        System.out.println("Char  " + ch);
        System.out.print("From Int to byte ");
        System.out.println(GetByteFromChar(ch));
        System.out.print("From Int to short ");
        System.out.println(GetShortFromChar(ch));
        System.out.print("From Int to char ");
        System.out.println(GetIntFromChar(ch));
        System.out.print("From Int to long ");
        System.out.println(GetLongFromChar(ch));
        System.out.print("From Int to float ");
        System.out.println(GetFloatFromChar(ch));
        System.out.print("From Int to double ");
        System.out.println(GetDoubleFromChar(ch));
        System.out.println("Long  " + lon);
        System.out.print("From Long to byte ");
        System.out.println(GetByteFromLong(lon));
        System.out.print("From Long to short ");
        System.out.println(GetShortFromLong(lon));
        System.out.print("From Long to char ");
        System.out.println(GetCharFromLong(lon));
        System.out.print("From Long to int ");
        System.out.println(GetIntFromLong(lon));
        System.out.print("From Long to float ");
        System.out.println(GetFloatFromLong(lon));
        System.out.print("From Long to double ");
        System.out.println(GetDoubleFromLong(lon));
        System.out.println("Float  " + flo);
        System.out.print("From Float to byte ");
        System.out.println(GetByteFromFloat(flo));
        System.out.print("From Float to short ");
        System.out.println(GetShortFromFloat(flo));
        System.out.print("From Float to char ");
        System.out.println(GetCharFromFloat(flo));
        System.out.print("From Float to int ");
        System.out.println(GetIntFromFloat(flo));
        System.out.print("From Float to long ");
        System.out.println(GetLongFromFloat(flo));
        System.out.print("From Float to double ");
        System.out.println(GetDoubleFromFloat(flo));
        System.out.println("Double  " + doub);
        System.out.print("From Double to byte ");
        System.out.println(GetByteFromDouble(doub));
        System.out.print("From Double to short ");
        System.out.println(GetShortFromDouble(doub));
        System.out.print("From Double to char ");
        System.out.println(GetCharFromDouble(doub));
        System.out.print("From Double to int ");
        System.out.println(GetIntFromDouble(doub));
        System.out.print("From Double to long ");
        System.out.println(GetLongFromDouble(doub));
        System.out.print("From Double to double ");
        System.out.println(GetFloatFromDouble(doub));
    }

    private static short GetSHortFromByte(byte x) {
        short shortFromByte;
        shortFromByte = x;
        return shortFromByte;
    }

    private static int GetIntFromByte(byte x) {
        int intFromByte;
        intFromByte = x;
        return intFromByte;
    }

    private static char GetCharFromByte(byte x) {
        char charFromByte;
        charFromByte = (char) x;
        return charFromByte;
    }

    private static long GetLongFromByte(byte x) {
        long longFromByte;
        longFromByte = (long) x;
        return longFromByte;
    }

    private static float GetFloatFromByte(byte x) {
        float floatFromByte;
        floatFromByte = (float) x;
        return floatFromByte;
    }

    private static double GetDoubleFromByte(byte x) {
        double doubleFromByte;
        doubleFromByte = (double) x;
        return doubleFromByte;
    }

    private static byte GetByteFromShort(short x) {
        byte byteFromShort;
        byteFromShort = (byte) x;
        return byteFromShort;
    }

    private static int GetIntFromShort(short x) {
        int IntFromShort;
        IntFromShort = x;
        return IntFromShort;
    }

    private static char GetCharFromShort(short x) {
        char CharFromShort;
        CharFromShort = (char) x;
        return CharFromShort;
    }

    private static long GetLongFromShort(short x) {
        long LongFromShort;
        LongFromShort = (long) x;
        return LongFromShort;
    }

    private static float GetFloatFromShort(short x) {
        float FloatFromShort;
        FloatFromShort = (float) x;
        return FloatFromShort;
    }

    private static double GetDoubleFromShort(short x) {
        double DoubleFromShort;
        DoubleFromShort = (double) x;
        return DoubleFromShort;
    }

    private static byte GetByteFromInt(int x) {
        byte ByteFromInt;
        ByteFromInt = (byte) x;
        return ByteFromInt;
    }

    private static int GetShortFromInt(int x) {
        int ShortFromInt;
        ShortFromInt = (short) x;
        return ShortFromInt;
    }

    private static char GetCharFromInt(int x) {
        char CharFromInt;
        CharFromInt = (char) x;
        return CharFromInt;
    }

    private static long GetLongFromInt(int x) {
        long LongFromInt;
        LongFromInt = (long) x;
        return LongFromInt;
    }

    private static float GetFloatFromInt(int x) {
        float FloatFromInt;
        FloatFromInt = (float) x;
        return FloatFromInt;
    }

    private static double GetDoubleFromInt(int x) {
        double DoubleFromInt;
        DoubleFromInt = (double) x;
        return DoubleFromInt;
    }

    private static byte GetByteFromChar(char x) {
        byte ByteFromChar;
        ByteFromChar = (byte) x;
        return ByteFromChar;
    }

    private static int GetShortFromChar(char x) {
        int ShortFromChar;
        ShortFromChar = (short) x;
        return ShortFromChar;
    }

    private static char GetIntFromChar(char x) {
        char IntFromChar;
        IntFromChar = (char) x;
        return IntFromChar;
    }

    private static long GetLongFromChar(char x) {
        long LongFromChar;
        LongFromChar = (long) x;
        return LongFromChar;
    }

    private static float GetFloatFromChar(char x) {
        float FloatFromChar;
        FloatFromChar = (float) x;
        return FloatFromChar;
    }

    private static double GetDoubleFromChar(char x) {
        double DoubleFromChar;
        DoubleFromChar = (double) x;
        return DoubleFromChar;
    }

    private static byte GetByteFromLong(long x) {
        byte ByteFromLong;
        ByteFromLong = (byte) x;
        return ByteFromLong;
    }

    private static int GetShortFromLong(long x) {
        int ShortFromLong;
        ShortFromLong = (short) x;
        return ShortFromLong;
    }

    private static char GetCharFromLong(long x) {
        char CharFromLong;
        CharFromLong = (char) x;
        return CharFromLong;
    }

    private static long GetIntFromLong(long x) {
        long IntFromLong;
        IntFromLong = (long) x;
        return IntFromLong;
    }

    private static float GetFloatFromLong(long x) {
        float FloatFromLong;
        FloatFromLong = (float) x;
        return FloatFromLong;
    }

    private static double GetDoubleFromLong(long x) {
        double DoubleFromLong;
        DoubleFromLong = (double) x;
        return DoubleFromLong;
    }

    private static byte GetByteFromFloat(float x) {
        byte ByteFromFloat;
        ByteFromFloat = (byte) x;
        return ByteFromFloat;
    }

    private static int GetShortFromFloat(float x) {
        int ShortFromFloat;
        ShortFromFloat = (short) x;
        return ShortFromFloat;
    }

    private static char GetCharFromFloat(float x) {
        char CharFromFloat;
        CharFromFloat = (char) x;
        return CharFromFloat;
    }

    private static long GetIntFromFloat(float x) {
        long IntFromFloat;
        IntFromFloat = (int) x;
        return IntFromFloat;
    }

    private static float GetLongFromFloat(float x) {
        float LongFromFloat;
        LongFromFloat = (long) x;
        return LongFromFloat;
    }

    private static double GetDoubleFromFloat(float x) {
        double DoubleFromFloat;
        DoubleFromFloat = (double) x;
        return DoubleFromFloat;
    }

    private static byte GetByteFromDouble(double x) {
        byte ByteFromDouble;
        ByteFromDouble = (byte) x;
        return ByteFromDouble;
    }

    private static int GetShortFromDouble(double x) {
        int ShortFromDouble;
        ShortFromDouble = (short) x;
        return ShortFromDouble;
    }

    private static char GetCharFromDouble(double x) {
        char CharFromDouble;
        CharFromDouble = (char) x;
        return CharFromDouble;
    }

    private static long GetIntFromDouble(double x) {
        long IntFromDouble;
        IntFromDouble = (long) x;
        return IntFromDouble;
    }

    private static float GetLongFromDouble(double x) {
        float LongFromDouble;
        LongFromDouble = (long) x;
        return LongFromDouble;
    }

    private static double GetFloatFromDouble(double x) {
        double FloatFromDouble;
        FloatFromDouble = (double) x;
        return FloatFromDouble;
    }

}
