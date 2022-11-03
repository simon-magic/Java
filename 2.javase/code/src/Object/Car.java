package Object;

public class Car {
    String name;
    double price;

    public Car(){
        System.out.println("无参构造器被调用。");
    }

    public Car(String name, double price){
        System.out.println("有参数构造器被调用。");
        this.name = name;
        this.price = price;
    }
}

