package src.solvingASimpleQuiz.KeywordSuper;

public class BankAccount {
    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }

    static class CheckingAccount extends BankAccount {
        protected double fee;

        public CheckingAccount(String number, Long balance, double fee) {
            super(number, balance);
            this.fee = fee;
        }
    }

    static class SavingsAccount extends BankAccount {
        protected double interestRate;

        public SavingsAccount(String number, Long balance, double interestRate) {
            super(number, balance);
            this.interestRate = interestRate;
        }
    }

    public static void main(String[] args) {
        String chNumber = "CH-123";
        Long chBalance = 1000L;
        double chFee = 10.0;

        String savNumber = "SAV-456";
        Long savBalance = 2000L;
        double savInterestRate = 0.05;

        final CheckingAccount chAcc = new CheckingAccount(chNumber, chBalance, chFee);
        final SavingsAccount savAcc = new SavingsAccount(savNumber, savBalance, savInterestRate);

        System.out.println(chAcc);
        System.out.println(savAcc);
    }
}
