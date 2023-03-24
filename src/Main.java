public class Main {
    public static void call(Class cls, String methodName) throws Exception {
        cls.getDeclaredMethod(methodName).invoke(null);
    }

    public static void main(String[] args) {
        var tasksCount = 5;
        for (var i = 1; i <= tasksCount; i++) {
            try {
                call(Main.class, "task" + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String checkOS(byte clientOS) {
        if (clientOS == 0) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 1) {
            return "Установите версию приложения для Android по ссылке";
        }
        return "";
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        System.out.println(checkOS(clientOS));
        clientOS = 0;
        System.out.println(checkOS(clientOS));
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }  else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Нет доставки");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2: {
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону зима");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону весна");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону лето");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону осень");
                break;
            }
            default:
                break;
        }
    }
}