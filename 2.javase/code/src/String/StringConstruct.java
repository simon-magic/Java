package String;

public class StringConstruct {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   // true

        char[] chars1 = new char[]{'a', 'b', 'c'};
        String s3 = new String(chars1);
        String s4 = new String(chars1);
        System.out.println(s3 == s4);   // false

        byte[] byte1 = new byte[]{97, 98, 99, 65, 66, 67};
        String s5 = new String(byte1);
        System.out.println(s5);         // abcABC

    }
}
