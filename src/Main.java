public class Main {
    public static void main(String[] args) {

        int check = 350; //начальный счёт
        int sum = 1355; //сумма пополнения

        int bonus; //бонусы
        if (sum >= 1000) {

            bonus = sum / 100;
        } else {
            bonus = 0;
        }

        int result = check + sum + bonus;

        System.out.println(result);
    }
}
