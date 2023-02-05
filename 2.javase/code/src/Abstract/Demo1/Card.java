package Abstract.Demo1;

public abstract class Card {
    private String userName;
    private double money;

    // 支付方法，抽象方法
    public abstract void pay(double money);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
