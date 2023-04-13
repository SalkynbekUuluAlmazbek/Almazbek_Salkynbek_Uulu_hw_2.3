public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        account.deposit(20000);
        System.out.println("На вашем счету: " + account.getAmount() + " сом");

        try {
            while (true) {
                account.withdraw(6000);
                System.out.println("Выведено 6000, остаток на счете: " + account.getAmount() + " сом");
            }
        } catch (LimitException e) {
            System.out.println("Исключение: " + e.getMessage());
            System.out.println("Остаток на счете: " + e.getRemainingAmount() + " сом");
            System.out.println("Снимаем остаток: " + e.getRemainingAmount() + " сом");
            try {
                account.withdraw(2000);
                System.out.println("Текущий остаток: " + account.getAmount() + " сом");
            } catch (LimitException ex) {

            }

        }
    }
}