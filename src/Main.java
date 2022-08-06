import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int clientOS = 0;
        if (clientOS == 1)
        {System.out.println("Установите верию приложения для Android по ссылке");
        }
        if (clientOS == 0)
        {System.out.println( "Установите версию приложения для iOS по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");

        int clientDeviceYear = 2013;
        int OS = 1;
        if (OS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  if (OS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задание 3
        System.out.println("Задание 3");

        int year = 2400;

        if (year %4 == 0 && year %100 != 0 || year %400 == 0) {
            System.out.println(year + " год является високосным");
        }
            else {System.out.println(year + " год не является високосным");
        }

        // Задание 4
        System.out.println("Задание 4");

        int deliveryDistance = 60;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        }    else if (deliveryDistance >= 20 && deliveryDistance < 60){
                System.out.println("Потребуется дней " + (deliveryTime +1));
        }    else if (deliveryDistance >=60 && deliveryDistance <100){
                    System.out.println("Потребуется дней " + (deliveryTime+2));
        }    else {System.out.println("Доставка не осуществляется");
        }

        //Задание 5
        System.out.println("Задание 5");

        int monthNomber = 9;

        switch (monthNomber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }




        ;
    }
}
