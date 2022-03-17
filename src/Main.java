public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;
        int debitBalance = 1_100;

        int bonus = 1;

        if (debitBalance > 1000) {
            bonus = debitBalance / 100 * bonus;
            System.out.println("=========================");
            System.out.println("Бонус " + bonus + " р.");
            System.out.println("Ваш баланс: " + (currentBalance + debitBalance + bonus) + " р.");
            System.out.println("=========================");
        } else {
            bonus = 0;
            System.out.println("=========================");
            System.out.println("Бонус: " + bonus);
            System.out.println("Ваш баланс: " + (currentBalance + debitBalance));
            System.out.println("=========================");
        }

    }
}
