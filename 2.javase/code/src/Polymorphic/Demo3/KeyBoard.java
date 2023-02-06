package Polymorphic.Demo3;

public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public void keyDown(){
        System.out.println(name + "敲击了");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑中拔出");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
