package RedBag;

public class User {
    private String userName;
    private int leftMonney;
    public User() {

    }

    public User(String userName, int leftMonney) {
        this.userName = userName;
        this.leftMonney = leftMonney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLeftMonney() {
        return leftMonney;
    }

    public void setLeftMonney(int leftMonney) {
        this.leftMonney = leftMonney;
    }
    public void show() {
        System.out.println("用户" + userName + "\t" + "余额为"+ leftMonney);
    }
}
