package Abstract.Demo1;

public class Test {
    public static void main(String[] args) {
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("Tom");
        c.pay(1000);
    }
}
