package com.company;

public class Main {

    public static void main(String[] args) {
        boolean resultSum = within10and20(3, 5);
        System.out.println("Check sum = " + resultSum);
        isPositiveOrNegative(2);
        System.out.println("Is Negative? " + isNegative(-3));
        printWordNTimes("Указанная строка", 3);
        System.out.println(checkYear(2021));

    }


    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printWordNTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    public static boolean checkYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}