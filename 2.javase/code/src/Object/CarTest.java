package Object;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "奔驰";
        c1.price = 38.9;
        System.out.println(c1.name + c1.price);

        Car c2 = new Car("奔驰", 39.8);
        System.out.println(c2.name + c2.price);
    }

}
