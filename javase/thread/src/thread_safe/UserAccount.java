package thread_safe;

public class UserAccount extends Thread {
    public static void main(String[] args) {
        Account lisi = new Account(10000, "lisi");
        UserAccount u1 = new UserAccount(lisi);
        UserAccount u2 = new UserAccount(lisi);
        u1.setName("li1");
        u2.setName("li2");
        u1.start();
        u2.start();
    }
    private Account act ;

    public UserAccount(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        int count = 5000;
        try {
            act.useAccount(count);
            System.out.println(this.getName() + ":" + act.getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
