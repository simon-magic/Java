package Static;

public class SingleInstance1Test {
    public static void main(String[] args) {
        SingleInstance1 s1 = SingleInstance1.getInstance();
        SingleInstance1 s2 = SingleInstance1.getInstance();
        System.out.println(s1 == s2);   // true
    }
}
