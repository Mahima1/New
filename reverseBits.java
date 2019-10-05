import java.lang.*;

public class reverseBits {
    public static int reverseBits(int n) {
//        String str = "";
//        int mask = 1;
        System.out.println("j   " + Integer.MAX_VALUE);
        int mask = 1, count = 0, num = 0;

        while (count < 31) {
            int bit = mask & n;
            if (bit == 1) {
                num = num | (int) Math.pow(2, (32 - mask));
            } else {
                num = num & (int) Math.pow(2, (32 - mask));
            }
            System.out.println("count is: " + count);
            System.out.println("mask is :" + mask);
            mask = mask << 1;
            count++;
        }

        return num;
//        for (int i = 0; i < 30; i++) {
//
//            System.out.print(mask + " ");
//
//            if ((n & mask) == 1) {
//                str = str + "1";
//            } else {
//                str = str + "0";
//            }
//            mask = mask << 1;
////            (n & i) ? printf("1") : printf("0");
//        }
//        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.print("asn is: " + reverseBits(-3));
    }
}
