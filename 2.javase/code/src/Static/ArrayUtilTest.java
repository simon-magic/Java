package Static;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = {};
        int[] arr3 = new int[] {12, 13, 14, 15, 16};

        System.out.println(ArrayUtil.toString(arr1));   // null
        System.out.println(ArrayUtil.toString(arr2));   // []
        System.out.println(ArrayUtil.toString(arr3));   // [12,13,14,15,16]
    }
}
