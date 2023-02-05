package Abstract.Demo1;

public class GoldCard extends Card{
    @Override
    public void pay(double money) {
        System.out.println("您当前消费" + money);
        System.out.println("您卡内余额是：" + getMoney());
        // 优惠价
        double rs = money * 0.8;
        System.out.println("您实际支付：" + rs);
        // 更新账户余额
        setMoney(getMoney() - rs);
        System.out.println("剩余：" + getMoney());
    }
}
