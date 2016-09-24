package task6_1;


public class ArraysUtils {

    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int min(int array[]) {
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;

    }

    public static int maxPositive(int array[]) {
        int maxPositive = array[5];
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i]) maxPositive = array[i];
            else if (maxPositive <= 0) maxPositive = 0;

        }
        return maxPositive;
    }

    public static int multiplication(int array[]) {
        int multiplication = 1;
        for (int item : array) multiplication *= item;

        return multiplication;
    }

    public static int modulus(int array[]) {
        int result = 0;
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        result = firstElement % lastElement;
        return result;
    }

    public static int secondLargest(int array[]) {
        int max = 0;
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            } else if (secondLargest < array[i] && max != array[i]) secondLargest = array[i];
        }
        return secondLargest;
    }

    public static int[] reverse(int[] array) {
        int count = array.length - 1;
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 || array[i] <= 0) {
                arr[count] = array[i];
                if (count == 0) count++;
                count--;
            }
        }
        return arr;
    }

    public static int[] findEvenElements(int[] array) {
        int count = array.length;
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                arr[i] = array[i];
            }


        }

        return arr;
    }
}
