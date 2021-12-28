package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_test {
    private static void showMessage(int i)
    {
        System.out.println("Message #" + i);
    }

    private static void ex1() {
        for (int i = 1; i <= 15; i++) {
            switch (i) {
                case 1:
                    showMessage(1);
                    break;
                case 2:
                    showMessage(2);
                    break;
                case 3:
                    showMessage(3);
                    break;
                case 4:
                    showMessage(4);
                    break;
                case 5:
                    showMessage(5);
                    break;
                case 6:
                    showMessage(6);
                    break;
                case 7:
                    showMessage(7);
                    break;
                case 8:
                    showMessage(8);
                    break;
                case 9:
                    showMessage(9);
                    break;
                case 10:
                    showMessage(10);
                    break;
                case 11:
                    showMessage(11);
                    break;
                case 12:
                    showMessage(12);
                    break;
                case 13:
                    showMessage(13);
                    break;
                case 14:
                    showMessage(14);
                    break;
                case 15:
                    showMessage(15);
                    break;
                default:
                    break;
            }
        }
    }

    private static int[] fib(final int N)
    {
        if (N < 2)
        {
            System.out.println("ОШИБКА: слишком мало элементов последовательности Фибоначчи!");
            System.exit(1);
        }

        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < N; i++)
            arr[i] = arr[i - 2] + arr[i - 1];
        return arr;
    }

    private static void show_fib(int[] fib_arr, final int N)
    {
        System.out.print("fib(" + N + "): -> ");
        for (int x : fib_arr)
            System.out.print(x + ",");
        System.out.println();
    }

    private static void ex2() {
        char response; // Решение пользователя по продолжению работы программы
        int[] fib_arr; // Сам массив последовательности Фибоначчи
        int N; // Количество элементов
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Введите количество элементов последовательности Фибоначчи: ");
            N = in.nextInt();
            fib_arr = fib(N);
            show_fib(fib_arr, N);

            // Предложение продолжить
            System.out.print("Желаете ли вы продолжить?(y/n): ");
            response = in.next().charAt(0);
            System.out.println();
        } while (response == 'y' || response == 'Y');
        in.close();
    }

    private static boolean isArraysEqual(int[] a1, int[] a2, final int N)
    {
        for (int i = 0; i < N; i++)
            if (a1[i] != a2[i])
                return false;
        return true;
    }

    private static void ex3() {
        final int N = 4;
        int[] a1 = new int[N];
        int[] a2 = new int[N];
        int x;
        for (int i = 11; i < 100; i++)
        {
            for (int k = 99; k >= i; k--)
            {
                x = i * k;
                if (x < 1000) break;

                a1[0] = i % 10;
                a1[1] = i / 10;
                a1[2] = k % 10;
                a1[3] = k / 10;
                Arrays.sort(a1);

                a2[0] = x % 10;
                a2[1] = x / 10 % 10;
                a2[2] = x / 100 % 10;
                a2[3] = x / 1000;
                Arrays.sort(a2);

                if (isArraysEqual(a1, a2, N))
                    System.out.println(i + "*" + k + "=" + x);
            }
        }
    }

    public static void testEx1() {
        ex1();
    }

    public static void testEx2() {
        ex2();
    }

    public static void testEx3() {
        ex3();
    }
}
