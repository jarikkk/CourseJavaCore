package homework2_1;

public class Arrays {

    static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    static double sum(double array[]) {
        double sum = 0;
        for (double item : array) {
            sum += item;
        }
        return sum;
    }

    static int min(int array[]) {
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    static double min(double array[]) {
        double min = array[5];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    static int max(int array[]) {
        int max = array[6];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;

    }

    static double max(double array[]) {
        double max = array[5];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }

    static int maxPositive(int array[]) {
        int maxPositive = array[5];
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i]) maxPositive = array[i];
            else if (maxPositive <= 0) maxPositive = 0;

        }
        return maxPositive;
    }

    static double maxPositive(double array[]) {
        double maxPositive = array[5];
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i]) maxPositive = array[i];
            else if (maxPositive <= 0) maxPositive = 0;

        }
        return maxPositive;
    }

    static int multiplication(int array[]) {
        int multiplication = 1;
        for (int item : array) multiplication *= item;

        return multiplication;
    }

    static double multiplication(double array[]) {
        double multiplication = 1.0;
        for (double item : array) multiplication *= item;

        return multiplication;
    }

    static int modulus(int array[]) {
        int result = 0;
        int firstelement = array[0];
        int lastelement = array[array.length-1];
        result = firstelement%lastelement;
        return result;
    }

    static double modulus(double array[]) {
        double result = 0;
        double firstelement = array[0];
        double lastelement = array[array.length-1];
        result = firstelement%lastelement;
        return result;
    }

    static int secondLargest(int array[]) {
        int max = array[6];
        int secondLargest = array[6];
        for (int i = 0; i < array.length; i++) {
            if (array[i]> max) {
                secondLargest = max;
                max = array[i];
            }
            else if (secondLargest < array[i]) secondLargest = array[i];
        }
        return secondLargest;
    }

    static double secondLargest(double array[]) {
        double max = array[6];
        double secondLargest = array[6];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            } else if (secondLargest < array[i]) secondLargest = array[i];
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers1 = {9000, -7812, 35, -890, 1, 3567, -4908, 10564, 777, -666};
        double[] numbers2 = {-3.75, 7.84, -1.10, 10.51, 4.36, -7.70, 9.52, -64.47, 100.79, -8.88};

        System.out.println("sum int is: " + sum(numbers1));
        System.out.println("sum double is: " + sum(numbers2));
        System.out.println("min int is: " + min(numbers1));
        System.out.println("min double is: " + min(numbers2));
        System.out.println("max int is: " + max(numbers1));
        System.out.println("max double is: " + max(numbers2));
        System.out.println("maxPositive int is: " + maxPositive(numbers1));
        System.out.println("maxPositive double is: " + maxPositive(numbers2));
        System.out.println("multiplication int is: " + multiplication(numbers1));
        System.out.println("multiplication double is: " + multiplication(numbers2));
        System.out.println("modulus int is: " + modulus(numbers1));
        System.out.println("modulus double is: " + modulus(numbers2));
        System.out.println("secondLargest int is: " + secondLargest(numbers1));
        System.out.println("secondLargest double is: " + secondLargest(numbers2));
    }
}
