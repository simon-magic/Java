package P2_String;

import org.junit.Test;

public class LeetCode_7_reverse_integer {
    @Test
    public void test(){
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    public int reverse(int x) {
        String reString = "";
        if (x<0){
            reString += "-";
            String xStr = x + "";
            for (int i = xStr.length() - 1; i > 0; i--) {
                reString += xStr.charAt(i);
            }
        }else {
            String xStr = x + "";
            for (int i = xStr.length() - 1; i > -1; i--) {
                reString += xStr.charAt(i);
            }
        }

        try {
            return Integer.parseInt(reString);
        }catch (Exception e){
            return 0;
        }


    }
}
