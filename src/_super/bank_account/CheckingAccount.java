package _super.bank_account;

class CheckingAccount extends BankAccount {
    protected double fee;

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}

