package Lab5;

import java.util.Scanner;

public class Lab5_test {
    private static String toText(String num_str)
    {
        StringBuilder num_strb = new StringBuilder(num_str);
        String result = ""; // результат
        int num_len = num_strb.length(); // длина исходной строки

        long num_int = Long.parseLong(num_str); // число в виде long long для проверки на диапазон

        if (num_len > 10 || num_int > Integer.MAX_VALUE)
        {
            System.out.println("ОШИБКА: Введенное число больше диапазона unsigned long int!");
            System.exit(1);
        }
        else if (num_int < 0)
        {
            System.out.println("ОШИБКА: Введенное число меньше 0!");
            System.exit(2);
        }
        else if (num_int == 0)
            return "zero";

        if (num_len % 3 == 1) num_strb.insert(0,"00"); // добавляем недостающие нули в начале
        else if (num_len % 3 == 2) num_strb.insert(0, '0');

        num_len = num_strb.length(); // заново считаем длину строки

        int triplet_count = num_len / 3; // считаем количество триплетов
        for (int i = triplet_count; i > 0; i--)
        {
            int x =  Integer.parseInt(num_strb.substring(num_len-3*i, num_len-3*i+3)); // берем нужный триплет

            if (x == 0) continue;

            int hundreds_count = x / 100;
            int decades_count = (x / 10) % 10;
            int units_count = x % 10;
            if (decades_count < 2)
            {
                units_count += decades_count * 10;
                decades_count = 0;
            }

            // считаем сотни
            switch (hundreds_count)
            {
                case 1:
                    result += "one hundred ";
                    break;
                case 2:
                    result += "two hundred ";
                    break;
                case 3:
                    result += "three hundred ";
                    break;
                case 4:
                    result += "four hundred ";
                    break;
                case 5:
                    result += "five hundred ";
                    break;
                case 6:
                    result += "six hundred ";
                    break;
                case 7:
                    result += "seven hundred ";
                    break;
                case 8:
                    result += "eight hundred ";
                    break;
                case 9:
                    result += "nine hundred ";
                    break;
                default:
                    break;
            }

            // считаем десятки
            switch (decades_count)
            {
                case 2:
                    result += "twenty ";
                    break;
                case 3:
                    result += "thirty ";
                    break;
                case 4:
                    result += "fourty ";
                    break;
                case 5:
                    result += "fifty ";
                    break;
                case 6:
                    result += "sixty ";
                    break;
                case 7:
                    result += "seventy ";
                    break;
                case 8:
                    result += "eighty ";
                    break;
                case 9:
                    result += "ninety ";
                    break;
                default:
                    break;
            }

            // считаем единицы
            switch (units_count)
            {
                case 1:
                    result += "one ";
                    break;
                case 2:
                    result += "two ";
                    break;
                case 3:
                    result += "three ";
                    break;
                case 4:
                    result += "four ";
                    break;
                case 5:
                    result += "five ";
                    break;
                case 6:
                    result += "six ";
                    break;
                case 7:
                    result += "seven ";
                    break;
                case 8:
                    result += "eight ";
                    break;
                case 9:
                    result += "nine ";
                    break;
                case 10:
                    result += "ten ";
                    break;
                case 11:
                    result += "eleven ";
                    break;
                case 12:
                    result += "twelve ";
                    break;
                case 13:
                    result += "thirteen ";
                    break;
                case 14:
                    result += "fourteen ";
                    break;
                case 15:
                    result += "fifteen ";
                    break;
                case 16:
                    result += "sixteen ";
                    break;
                case 17:
                    result += "seventeen ";
                    break;
                case 18:
                    result += "eighteen ";
                    break;
                case 19:
                    result += "nineteen ";
                    break;
                default:
                    break;
            }

            // добавляем обозначения (миллиар, миллион, тысяча) после нужных триплетов
            switch (i)
            {
                case 4:
                    result += "billion ";
                    break;
                case 3:
                    result += "million ";
                    break;
                case 2:
                    result += "thousand ";
                    break;
                default:
                    break;
            }
        }

        return result;
    }

    public static void test() {
        char response;
        Scanner in = new Scanner(System.in);
        do {
            String number;
            System.out.print("Введите число: ");
            number = in.nextLine();
            System.out.println("Ваше число: " + toText(number));

            System.out.print("Желаете ли вы продолжить (y/n): ");
            response = in.nextLine().charAt(0);
        } while (response == 'y' || response == 'Y');
    }
}
