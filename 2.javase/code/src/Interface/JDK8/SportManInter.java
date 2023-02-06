package Interface.JDK8;

public interface SportManInter {
    /**
     * 1. JDK 8 开始，默认方法（实例方法）
     * -- 必须default修饰，默认用public修饰
     * -- 默认方法，接口不能创建对象，这个方法只能过继给了实现类，由实现类的对象调用
     */

    default void run(){
        go();
        System.out.println("跑得快");
    }

    /**
     * 2. 静态方法：必须使用static修饰，默认用public修饰
     * -- 接口的静态方法，必须接口名自己调用
     */
    static void inAddr(){
        System.out.println("静态方法");
    }

    /**
     * 3. 私有方法
     * -- JDK 1.9 开始支持
     * -- 必须在接口内部才能访问
     */
    private void go(){
        System.out.println("开始锻炼");
    }
}

class PingPongMan implements SportManInter{

}

class Test{
    public static void main(String[] args) {
        // 1. default
        PingPongMan p = new PingPongMan();
        p.run();

        // 2. static
        SportManInter.inAddr();
        // PingPongMan.inAddr();

        // 3. private
        p.run();

    }
}
