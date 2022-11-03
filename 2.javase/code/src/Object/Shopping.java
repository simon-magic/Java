package Object;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while (true){
            System.out.println("请添加如下命令操作：");
            System.out.println("添加商品：add；查询商品：query；修改数量：update；结算金额：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入命令：");
            String command = sc.next();
            switch (command) {
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("输入命令有误！");
            }
        }
    }

    private static void payGoods(Goods[] shopCar) {
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g!=null){
                money += g.price * g.number;
            }else {
                break;
            }
        }
        System.out.println("订单总金额：" + money);
    }

    private static Goods getGoodsById(Goods[] shopCar, int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g!= null && g.id == id){
                return g;
            }
        }
        return null;
    }

    private static void queryGoods(Goods[] shopCar) {
        System.out.println("========查询信息如下========");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g!=null){
                System.out.println(g.id+"\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.number);
            }else {
                break;
            }
        }

    }

    private static void updateGoods(Goods[] shopCar, Scanner sc) {
        while (true){
            System.out.println("请输入修改的商品id:");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if(g==null){
                System.out.println("对不起，购物车没有添加这个商品");
            }else {
                System.out.println("请输入：" + g.name + "购买数量：");
                int buyNumber = sc.nextInt();
                g.number = buyNumber;
                System.out.println("修改完成！");
                queryGoods(shopCar);
                break;
            }
        }

    }

    private static void addGoods(Goods[] shopCar, Scanner sc) {
        // 1. 用户录入商品信息
        System.out.println("请输入购买商品编号：");
        int id = sc.nextInt();
        System.out.println("请输入购买商品名称：");
        String name = sc.next();
        System.out.println("请输入购买商品数量：");
        int number = sc.nextInt();
        System.out.println("请输入购买商品价格：");
        double price = sc.nextInt();

        // 2. 所购买的商品封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.number = number;
        g.price = price;

        // 3. 把商品对象添加到购物车中
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]==null){
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品添加完成！");
    }
}
