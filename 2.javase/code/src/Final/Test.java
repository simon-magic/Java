package Final;

public class Test {
    public static void main(String[] args) {
        // 1. final修饰类，类不能被继承
        // 2. final修饰方法，方法不能被重写
        // 3. final修饰变量，变量有且只能被赋值一次
        final double rate = 3.14;
    }
}

// 1. final修饰类
final class Animal {
}

//class Wolf extends Animal{
//    // 则此处不能继承Animal类
//}

// 2. final修饰方法
class People{
    public final void eat(){
        System.out.println("人要吃东西");
    }
}

class Student extends People{
//    public void eat(){
//        // 则方法不能重写
//        System.out.println("学生吃的很多");
//    }
}

// 2. final修饰变量
// 变量有两种：
// 1. 局部变量
// 2. 成员变量
//      2.1 实例成员变量
//      2.2 静态成员变量
class Buy{
    static void budge(final double z){
        // z 不能进行二次赋值
    }
}
