public class Main {
    public static void main(String[] args) {
//Задание 6
        System.out.println("Задание 6");

        int age = 50;
        int salary = 90000;
        double limit;

        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }

        if (salary >= 50000) {
            limit *= 1.2;
        } else if (salary >= 80000)
        {
            limit *= 1.5;
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");


;
    }
}