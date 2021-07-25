

public class HomeWork {

    // 1.
    public static boolean isSumBetween(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
// 2.
    public static void isPositiveOrNegative(int value) {
        if (value >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    // 3.
    public static boolean isNegative(int value) {
        if (value >= 0) {
            return false;
        } else {
            return true;
        }
    }



// 4.
    public static void printNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {

            System.out.println(str);
        }
    }
// 5.
    public static boolean isLeap(int year) {

        if ((year % 4) != 0) {
            return false;
        }

        if (year % 100 != 0) {
            return true;
        }

        if (year % 400 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        isPositiveOrNegative(12);
        printNTimes("bob", 23);
    }
}



