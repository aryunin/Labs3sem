package Lab3;

import java.util.Scanner;

public class Lab3_test {
    public static void testEx1() {

    }

    public static void testEx2() {

    }

    private static void ex3() {
        char response; // Ответ пользователя на предложение продолжить
        Currency currency; // Валюта, выбранная пользователем
        int decision; // Решение о выборе валюты
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Выберете валюту (1-Доллар США/2-Евро/3-Рубль/4-Фунт/5-Гривна/6-Иены): ");
            decision = in.nextInt();
            in.nextLine();
            if(decision < 1 || decision > 6) {
                System.out.println("ОШИБКА: неверный выбор валюты!");
                System.exit(1);
            }
            currency = Currency.values()[decision-1];

            switch (currency)
            {
                case USD:
                    currency.showInfo();
                    break;
                case Euro:
                    currency.showInfo();
                    break;
                case Ruble:
                    currency.showInfo();
                    break;
                case Pound:
                    currency.showInfo();
                    break;
                case Hryvnia:
                    currency.showInfo();
                    break;
                case Jena:
                    currency.showInfo();
                    break;
                default:
                    break;
            }
            System.out.println();

            // Предложение продолжить
            System.out.print("Желаете ли вы продолжить?(y/n): ");
            response = in.nextLine().charAt(0);
            System.out.println();
        } while (response == 'Y' || response == 'y');
        in.close();
    }

    public static void testEx3() {
        ex3();
    }
}
