package constructors.user_account;

public class Main {
    public static void main(String[] args) {
        User user = new User("demo-user", "Alexander", "Schmidt" );
        Account account = new Account("123456", 1000, user);
        account.process(account);
        //account.process(new Account("123456", 1000, new User("demo-user", "Alexander", "Schmidt")));
    }
}

