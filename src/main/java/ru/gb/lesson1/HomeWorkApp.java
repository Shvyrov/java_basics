package ru.gb.lesson1;

import static java.lang.System.out;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        out.println("---");///визуальный разделитель
        checkSumSign();
        out.println("---");
        printColor();
        out.println("---");
        compareNumbers();
    }
//Пункт дз-2
    public static void printThreeWords() {
        out.println("Orange");
        out.println("Banana");
        out.println("Apple");
    }
//Пункт дз-3
    public static void checkSumSign() {
        int a = 22, b = 25 /*, c = a + b*/;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //Пункт дз-4
    public static void printColor() {
        int value;
        value = -10;
        if (value <= 0) {
            out.println("Красный");
        }
        else if (value <= 100) {
            out.println("Желтый");
        }
        else if (value > 100){
            out.println("Зелёный");
        }

    }
    //Пункт дз-5
    public static void compareNumbers() {
        int a = 1, b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            out.println("a < b");
        }
    }
}