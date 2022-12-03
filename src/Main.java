public class Main {
    public static void main(String[] args) {
        int balance = 80;
        int replenishment = 1200;
        if (replenishment <= 1000) {
            balance = balance + replenishment;
            System.out.println("Сумма пополнения " + replenishment + " руб.");
            System.out.println("Ваш баланс = " + balance + " руб.");
        } else {
            int bonus = replenishment / 100;
            balance = balance + replenishment + bonus;
            System.out.println("Сумма пополнения " + replenishment + " руб.");
            System.out.println("Начислено бонусов " + bonus);
            System.out.println("Ваш баланс = " + balance + " руб.");
        }
    }
}
