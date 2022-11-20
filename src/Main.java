import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int clientOS = 0;
        int clientDeviceYear = 2020;
        task1();
        printVersion(clientOS, clientDeviceYear);
        task3(deliveryDistance);
    }

    private static void task1() {

        System.out.println("Задание 1");

        int currentYear = LocalDate.now().getYear();
        printLeapYear(currentYear);
    }

    private static int task3(int deliveryDistance) {

        System.out.println("Задание 3");

        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        return deliveryDays;
    }

    public static void printLeapYear(int year) {

        // Задание 1
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный");
        } else {
            System.out.println(year + " - не високосный");
        }
    }

    public static void printVersion(int clientOS, int clientDeviceYear) {

        // Задание 2

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}

