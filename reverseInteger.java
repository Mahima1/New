public class reverseInteger {

    public static int reverse(int x) {
        int t;
        long val = 0;
        while (x != 0) {
            t = x % 10;
            x = x / 10;
//            System.out.println("t is : " + t);
            val = val * 10 + t;
            System.out.println("val is : " + val);
        }
        if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) {
            val = 0;
        }
        int p = (int) val;
        return p;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
