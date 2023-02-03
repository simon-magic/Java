package ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        // 1. 定义账户类
        // 2. 定义一个容器，负责以后存储全部的账户对象，进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 3. 展示系统的首页
        while (true){
            System.out.println("===================ATM首页===================");
            System.out.println("1、账户登录");
            System.out.println("2、账户开户");

            System.out.println("请您选择操作：");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    // 用户登录
                    login(accounts, sc);
                    break;
                case 2:
                    // 用户开户
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===================系统登录操作===================");
        if (accounts.size() == 0){
            System.out.println("当前系统无任何账户，请先开户，然后登录~");
            return;
        }

        while (true) {
            System.out.println("请输入卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null){
                while (true) {
                    System.out.println("请输入密码：");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)){
                        System.out.println("恭喜您，" + acc.getUserName() + "先生/女士，您登录成功，您的卡号是：" + acc.getCardId());
                        showUserCommand(sc, acc, accounts);
                        return;
                    }else {
                        System.out.println("对不起，您的密码有误~");
                    }
                }
            }else {
                System.out.println("对不起，系统中不存在该账户卡号~");
            }
        }
    }

    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("===================用户操作页===================");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 查询账户
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    depositMoney(acc, sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    // 转账
                    transferMoney(acc, sc, accounts);
                    break;
                case 5:
                    // 修改密码
                    updatePassword(acc, sc);
                    return;
                case 6:
                    // 退出
                    System.out.println("退出成功，欢迎下次光临！");
                    return;
                case 7:
                    // 注销账户
                    if (deleteAccount(acc, sc, accounts)){
                        return;
                    }else {
                        break;
                    }
                default:
                    System.out.println("输入命令有误！");
            }
        }
    }

    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("您真的要销户？y/n");
        String rs = sc.next();
        switch (rs){
            case "y":
                // 真正的销户
                accounts.remove(acc);
                System.out.println("您的账户销户成功！");
                return true;
            default:
                System.out.println("销户继续保留！");
        }
        return false;
    }

    private static void updatePassword(Account acc, Scanner sc) {
        System.out.println("===================用户修改密码===================");
        while (true) {
            System.out.println("请您输入当前密码：");
            String passWord = sc.next();
            if (acc.getPassWord().equals(passWord)){
                while (true) {
                    System.out.println("请您输入新的密码：");
                    String newPassWord = sc.next();
                    System.out.println("请您再次输入新的密码：");
                    String oKnewPassWord = sc.next();

                    if (newPassWord.equals(oKnewPassWord)){
                        acc.setPassWord(oKnewPassWord);
                        System.out.println("密码修改成功！");
                        return;
                    }else {
                        System.out.println("两次输入密码不一致！");
                    }
                }

            }else {
                System.out.println("您输入的密码错误！");
            }
        }
    }

    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("===================用户转账操作===================");
        // 判断是否足够两个账户
        if(accounts.size() > 2){
            System.out.println("当前系统中，不足两个账户，请去开户吧~");
            return;
        }

        // 判断自己账户是否有钱
        if(acc.getMoney() == 0){
            System.out.println("对不起，您的账户没有钱！");
            return;
        }

        // 开始转帐
        while (true) {
            System.out.println("请输入对方卡号：");
            String cardId = sc.next();

            // 此卡号不能是自己的卡号
            if (cardId.equals(acc.getCardId())){
                System.out.println("对不起，您不能给自己转账！");
                continue;
            }

            // 判断对方卡号
            Account account = getAccountByCardId(cardId, accounts);
            if (account == null){
                System.out.println("对方卡号不存在");
            }else {
                String userName = account.getUserName();
                String tip = "*" + userName.substring(1);
                System.out.println("请您输入【" + tip + "】的姓氏");

                String preName = sc.next();
                if (userName.startsWith(preName)){
                    System.out.println("请您输入转账金额：");
                    double money = sc.nextDouble();
                    if (money>acc.getMoney()){
                        System.out.println("对不起，您的余额不足，您最多可以转账：" + acc.getMoney());
                    }else {
                        acc.setMoney(acc.getMoney() - money);
                        account.setMoney(account.getMoney() + money);
                        System.out.println("转账成功，您的余额还剩：" + acc.getMoney());
                        return;
                    }
                }else {
                    System.out.println("您输入信息有误！");
                }
            }


        }
    }

    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("===================用户取钱操作===================");
        if(acc.getMoney() < 100){
            System.out.println("对不起，当前余额不足100，不能取钱！");
            return;
        }

        while (true) {
            System.out.println("请输入取款金额：");
            double money = sc.nextDouble();

            // 判断金额是否满足要求
            if(money>acc.getQuotaMoney()){
                System.out.println("对不起，取款金额超过限额，每次最多可取：" + acc.getQuotaMoney());
            }else {
                if (money>acc.getMoney()){
                    System.out.println("对不起，余额不足，当前余额为：" + acc.getMoney());
                }else {
                    System.out.println("恭喜您，取钱" + money + "元成功！");
                    acc.setMoney(acc.getMoney() - money);
                    showAccount(acc);
                    return;
                }
            }
        }
    }

    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("===================用户存钱操作===================");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();

        acc.setMoney(acc.getMoney() + money);
        System.out.println("恭喜您，存钱成功，当前信息如下：");
        showAccount(acc);
    }

    private static void showAccount(Account acc) {
        System.out.println("===================当前账户信息如下===================");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("户主：" + acc.getUserName());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("限额：" + acc.getQuotaMoney());
    }

    /**
     * 用户开户功能实现
     * @param accounts 接收的账户集合
     * @param sc 录入信息
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===================系统开户操作===================");
        // 1. 创建一个账户对象
        Account account = new Account();

        // 2. 录入信息
        while (true) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            account.setUserName(userName);

            System.out.println("请输入账户密码：");
            String passWord = sc.next();
            System.out.println("请再次输入密码：");
            String oKPassWord = sc.next();
            if (oKPassWord.equals(passWord)){
                account.setPassWord(oKPassWord);
                break;
            } else {
                System.out.println("对不起，两次输入密码不一致，请重新输入！");
            }
        }

        System.out.println("请输入账户当次限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 为账户生成一个8位不重复的号码
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        // 3. 将账户对象添加到账户集合中
        accounts.add(account);
        System.out.println("恭喜您，" + account.getUserName() + "先生/女士，您开户成功！您的卡号是：" + account.getCardId() + ",请妥善保管。");




    }

    private static String getRandomCardId(ArrayList<Account> accounts) {
        while (true) {
            Random r = new Random();
            // 1. 生成8位数字
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            // 2. 判断这个卡号是否重复
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null){
                return cardId;
            }
        }

    }

    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null; // 查无此号
    }
}
