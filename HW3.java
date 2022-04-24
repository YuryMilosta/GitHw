
public class HW3 {
    //1 «адать целочисленный массив, состо€щий из элементов 0 и 1. Ќапример:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Ќаписать метод, замен€ющий в прин€том массиве 0 на 1, 1 на 0;
    int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
    public static void main(String[] args) {

        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
    }

    public static int[] changing01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }
//2. «адать пустой целочисленный массив длиной 100. — помощью цикла заполнить его значени€ми 1 2 3 4 5 6 7 8 Е 100;
    public static void createArr(int[] array, int step, int shift) {
        for (int i = 0; i < 100; i++) {
            array[i] = shift + i * step;
        }

    }
//3. «адать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void modifierForArrayes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
//4. —оздать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    public static void createSquareArray(int size) {
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
    //6. * «адать одномерный массив и найти в нем минимальный и максимальный элементы;
    public static int minInArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int maxInArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;


    }
}














