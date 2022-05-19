package rekurze;

import java.util.Scanner;
import jdk.jshell.spi.ExecutionControl;

public class Rekurze {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int factorialRecur(int n) throws IllegalAccessException {
        if (n < 0) {
            throw new IllegalAccessException("Negative number");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorialRecur(n - 1);
    }

    public static int factorialIteration(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (n == 0) {
            return 1;

        }
        int a = n;
        for (int i = n - 1; i >= 1; i--) {
            a = a * i;

        }
        return a;
    }

    public static int maxrecursion(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int maybemax = maxrecursion(arr, n - 1);
        if (maybemax > arr[n - 1]) {
            return maybemax;
        }
        return arr[n - 1];
    }

    public static long fibonachirecur(int n) throws ExecutionControl.NotImplementedException {
        if (n <= 0) {
            throw new ExecutionControl.NotImplementedException("Neplatný vstup");
        }
        long fib = 0, n1 = 0, n2 = 1;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonachirecur(n);

        //return; 
    }

    public static int fibonaciItera(int n) {
        return fibonaciItera(n);
    }
    
//    public static String mystery(int n) {
//        Boolean pravda = false;
//        String s;
//        n = sc.nextInt();
//        while (pravda != true) {
//            if (n >= 0) {
//                pravda = true;
//            } else {
//                System.out.println("Neplatný stav: Zadejte kladné číslo");
//            }
//        }
//
//    }

}
