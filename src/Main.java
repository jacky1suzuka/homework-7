public class Main {
    public static void main(String[] args) {

        // Задание 1
        float goal = 2_459_000;
        float total = 0;
        float payment = 15_000;
        int monthCount = 0;

        while (total < goal) {
            monthCount = monthCount + 1;
            total = total + total/100;
            total = total + payment;
            System.out.println("Месяц " + monthCount + ", сумма накопление равна " + total + " рублей.");
        }

        // Задание 2
        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println("");

        for (; i > 0; i = i -1) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // Задание 3
        float population = 12_000_000;
        float deathRate = 0.008f;
        float birthRate = 0.017f;
        int year = 2022;

        while (year < 2032) {
            year++;
            population = population + population * birthRate - population * deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }

        // Задание 4
        float goal_2 = 12_000_000;
        float payment_2 = 15_000;
        float total_2 = 15_000;
        int monthCount_2 = 0;

        while (total_2 <= goal_2) {
            monthCount_2++;
            total_2 = (float) (total_2 + total_2 * 0.07);
            total_2 = total_2 + payment_2;
            System.out.println("Месяц " + monthCount_2 + ", сумма накопление равна " + total_2 + " рублей.");
        }

        // Задание 5
        float goal_3 = 12_000_000;
        float payment_3 = 15_000;
        float total_3 = 15_000;
        int monthCount_3 = 0;

        while (total_3 <= goal_3) {
            monthCount_3++;
            total_3 = (float) (total_3 + total_3 * 0.07);
            total_3 = total_3 + payment_3;
            if (monthCount_3 % 6 == 0) {
                System.out.println("Месяц " + monthCount_3 + ", сумма накопление равна " + total_3 + " рублей.");
            }
        }

        // Задание 6
        int monthCount_4 = 0;
        float payment_4 = 15_000;
        float total_4 = 15_000;

        while (monthCount_4 <= 12 * 9) {
            monthCount_4++;
            total_4 = (float) (total_4 + total_4 * 0.07);
            total_4 = total_4 + payment_4;
            if (monthCount_4 % 6 == 0) {
                System.out.println("Месяц " + monthCount_4 + ", сумма накопление равна " + total_4 + " рублей.");
            }
        }

        // Задание 7
        int firstFriday = 6;
        int monthDays = 31;

        for (int fridays = firstFriday; fridays <= monthDays; fridays = fridays + 7) {
            System.out.println("Сегодня пятница, " + fridays + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 8
        int currentYear = 2022;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;

        for (int y = 0; y <= futureYear; y = y + 79) {
            if (y >= pastYear && y <= futureYear) {
                System.out.println(y);
            }
        }

        // Задание 9
        for (int y = 1; y <= 10; y++) {
            System.out.println("2*" + y + "=" + y * 2);
        }

    }
}