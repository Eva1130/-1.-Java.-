package Lesson1;

public class MainApp {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -2;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");

        }
        if (value > 100) {
            System.out.println("Зелёный");

        }
    }

    public static void compareNumbers() {

        int a = 15;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");

        }
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
