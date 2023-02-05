package Modifier.itcast;

import Modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.protectedMethod();
        zi.publicMethod();

        Fu f = new Fu();
        f.publicMethod();
    }
}
