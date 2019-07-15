import java.util.Scanner;

public class WILLITST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        if (isPowerOfTwo(num)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

    }

    static boolean isPowerOfTwo(long x) {

        return x != 0 && ((x & (x - 1)) == 0);
    }
}



