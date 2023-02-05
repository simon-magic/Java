package Modifier;

public class Fu {
    // 只能本类中访问
    private void privateMethod(){
        System.out.println("---private---");
    }

    // 只能本类中、同包下其他类中访问
    void method(){
        System.out.println("---缺省---");
    }

    // 本类中、同包下其他类中、其他包的子类中
    protected void protectedMethod(){
        System.out.println("---protected---");
    }

    // 本类中、同包下其它类中、其他包的子类中、其他包的无关类中
    public void publicMethod(){
        System.out.println("---public---");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
