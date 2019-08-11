package day1;

import java.util.Scanner;

public class MathUtils {

    public static void main(String[] args) {
        calcSum();
    }

    // slajd 13
    // Wczytujący dwie liczby i wypisujący ich sumę
    public static void calcSum() {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbe 1:");
        int liczba1 = input.nextInt();
        System.out.println("Podaj liczbe 2:");
        int liczba2 = input.nextInt();

        int suma = liczba1 + liczba2;
        System.out.println("Suma liczb: " + liczba1 + ", " + liczba2 + " - wynosi: " + suma);
    }

    // Liczący wartość bezwzględną podanej liczby
     public static int calcAbs(int liczba) {
        if (liczba >= 0) {
            return liczba;
        } else {
            return liczba * -1;
        }
    }

    // Liczący silnię podanej liczby
     public static long calcFactorial(int liczba) {
        if (liczba < 0) {
            throw new WrongNumberException("Silnia moze byc liczona tylko dla wartosci wiekszych lub rownych 0");
        }

        if (liczba == 0) {
            return 1;
        } else {
            return liczba * calcFactorial(liczba - 1);
        }
    }

    // Sprawdzający, czy podana liczba jest pierwsza
    public static boolean isPrimary(int liczba) {
        if (liczba < 2) {
            throw new WrongNumberException("Liczba pierwsza nie moze byc liczba mniejsza od 2");
        }

        double limit = Math.sqrt(liczba);

        for (int i = 2; i <= limit; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }

        return true;
    }

}

class WrongNumberException extends RuntimeException {

    public WrongNumberException(String msg) {
        super(msg);
    }
}

