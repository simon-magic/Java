package Polymorphic.Demo3;

public class Test {
    public static void main(String[] args) {
        // 创建电脑对象
        Computer c = new Computer("DELL");

        // 创建鼠标对象，键盘对象
        USB u = new KeyBoard("logitech");
        c.installUSB(u);

        USB u1 = new Mouse("DELL");
        c.installUSB(u1);
    }
}
