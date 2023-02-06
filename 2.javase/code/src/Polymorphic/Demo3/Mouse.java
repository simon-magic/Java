package Polymorphic.Demo3;

public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public void dbClick(){
        System.out.println(name + "双击了");
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
