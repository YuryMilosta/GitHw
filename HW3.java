import java.util.Arrays;
public class HW3 {
    //1 «адать целочисленный массив, состо€щий из элементов 0 и 1. Ќапример:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Ќаписать метод, замен€ющий в прин€том массиве 0 на 1, 1 на 0;
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
         System.out.println("Exercise:1 ");
        ChangeNumbers(arr1); // Exercise 1 check
        System.out.println("\nExercise 2: ");
        fillArray(100); // Exercise 2 check
        System.out.println("\neExercise 3: ");
        multiplyBy6(arr3); // Exercise 3 check
        System.out.println("\nExercise4: ");
        twoDimensionalIntegerArray(); // Exercise 4 check
        System.out.println("\nExercise 5: ");
        oneDimensionalArray(5, 1); // Exercise 5 check
        System.out.println("\nExercise 6: ");
        minimumMaximumElements(arr6); // Exercise 6 check


    }

    // «аменить 0 на 1, 1 на 0;
    public static void ChangeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // «аполнить массив значени€ми 1 2 3 4 5 6 7 8 Е 100;
    public static void fillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    //«адать массив, пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void multiplyBy6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /*—оздать квадратный двумерный целочисленный массив, и с помощью цикла заполнить его диагональные
    элементы единицами (можно только одну из диагоналей, если обе сложно).
    */

    public static void twoDimensionalIntegerArray() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*Ќаписать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, кажда€ €чейка которого
    равна initialValue;
    */

    public static void oneDimensionalArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    // 6 * «адать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void minimumMaximumElements(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}



