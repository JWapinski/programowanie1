package day1;


import java.util.Arrays;
import java.util.Scanner;

public class FibonicciNumbers {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy:");
        int size = input.nextInt();


        // fillRecursion(size);

        fillWithArray(size);

    }

    public static void fillWithArray(int size) {
        long[] array = new long[size + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < size + 1; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println(Arrays.toString(array));
    }

    public static void fillRecursion(int size) {
        long[] array = new long[size];
        // size 8
        // {1, 1, 2, 3, 5, 8, 13, 21}
        for (int i = 0; i < array.length; i++) {
            array[i] = calcFibonacciNumberRecursion(i);
        }

        System.out.println(Arrays.toString(array));
    }

    // 1, 1, 2, 3, 5, 8, 13, ...
    // Fn = Fn-1 + Fn-2
    public static long calcFibonacciNumberRecursion(int number) {

        if (number <= 1) {
            return number;
        }

        return calcFibonacciNumberRecursion(number - 1) + calcFibonacciNumberRecursion(number - 2);
    }


}
