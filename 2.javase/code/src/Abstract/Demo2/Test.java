package Abstract.Demo2;

public class Test {
    public static void main(String[] args) {
        StudentMiddle s1 = new StudentMiddle();
        s1.write();

        StudentChild s2 = new StudentChild();
        s2.write();
    }
}
