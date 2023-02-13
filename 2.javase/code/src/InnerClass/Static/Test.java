package InnerClass.Static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.setName("张三");
        in.setAge(20);
    }
}
