package src.constructor.account;

import static src.constructor.account.User.process;

public class Main {
    public static void main(String[] args) {
        User user = new User("demo-user", "Alexander", "Schmidt");
        // create an instance of Account here
        Account account = new Account("123456", 1000, user);
        // pass it into process method
        process(account);
    }

    static class Account {
        private String code;
        private long balance;
        private User owner;

        public Account(String code, long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCode() {
            return code;
        }

        public long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }
}