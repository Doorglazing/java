package thread_safe1;

public class Account {
    private double balance;
    private String username;


    public Account(double balance, String username) {
        this.balance = balance;
        this.username = username;
    }

    public synchronized void  useAccount(int count) throws InterruptedException {
            double before = this.getBalance();
            double after = before - count;
            Thread.sleep(1000);
            this.setBalance(after);
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", username='" + username + '\'' +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
