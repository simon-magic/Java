package Extends;

public class Constructor1 extends Constructor{
    public Constructor1() {
        super();    // 写不写都有，默认找父类的无参数构造器执行
        System.out.println("子类无参构造器被执行");
    }

    public Constructor1(String name) {
        super();    // 写不写都有，默认找父类的无参数构造器执行
        System.out.println("子类有参构造器被执行");
    }
}
