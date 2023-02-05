package Abstract.Demo2;

public abstract class Student {

    // 模板方法
    public final void write(){
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("你的爸爸是啥样，来说说：");
        System.out.println(writeMain());
        System.out.println("我的爸爸就是这样一个好爸爸。");
    }

    public abstract String writeMain();
}
