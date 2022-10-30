public class Main {
    public static void checkLeap(int year) {
        boolean leap = ( year % 400 == 0 ) || ( year % 4 == 0 ) && ( year % 100 != 0 );
        if (leap == true) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void checkDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int year = 2022;
        checkLeap(year);
        // Задача 2
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2013;
        checkOS(clientOS, clientDeviceYear);
        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        checkDeliveryDays(deliveryDistance);
    }
}