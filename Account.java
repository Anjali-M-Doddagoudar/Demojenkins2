public class Account extends Bank {
    void showAccount() {
        System.out.println("This is a Savings Account");
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.showBank();      // Inherited from Bank
        acc.showAccount();   // From Account class
    }
}
