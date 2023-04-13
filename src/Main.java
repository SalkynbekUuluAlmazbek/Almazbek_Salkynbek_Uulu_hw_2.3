public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        account.deposit(20000);
        System.out.println("На вашем счету: " + account.getAmount());

        try {
            while (true) {
                account.withdraw(6000);
                System.out.println("Выведено 6000, остаток на счете: " + account.getAmount());
            }
        } catch (LimitException e) {
            System.out.println("Исключение: " + e.getMessage());
            System.out.println("Остаток на счете: " + e.getRemainingAmount());
        }
    }
}