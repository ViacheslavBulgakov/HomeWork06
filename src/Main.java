public class Main {
    public static void main(String[] args) {

        System.out.println("    Задание1");

        for (int i = 1; i < 11 ; i++) {
            System.out.println(i);
        }

        System.out.println("    Задание2");

        for ( int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("    Задание3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("    Задание4");

        for (int i = 10; i > -11 ; i--) {
            System.out.println(i);
        }

        System.out.println("    Задание5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println("    Задание6");

        for (int i = 1; 7 * i <= 98 ; i++) {
            System.out.println(7 * i);
        }

        System.out.println("    Задание7");

        for (int i = 1; i <= 512 ; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("    Задание8");

        for (int i = 1; i <= 12 ; i++) {
            int payment = 29000;
            int accumulation = payment * i;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation + " рублей.");
        }

        System.out.println("    Задание9");

        int deposit = 0;
        for (int i = 1; i <= 12 ; i++) {
            int payment = 29000;
            deposit = deposit + deposit / 100 + payment;
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей.");
        }

        System.out.println("    Задание10");

        for (int i = 1; i <= 10; i++) {
            int result = i * 2;
            System.out.println(2 + " * " + i + " = " + result);
        }
    }
}