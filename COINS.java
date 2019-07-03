import java.util.Arrays;
import java.util.Scanner;
//getCoins(t/2)+getCoins(t/3)+getCoins(t/4)

public class COINS {
    static long[] memo;

    static long getCoins(int t) {
        if (t < 4) {
            return t;
        }
        long r = Math.max((memo[t / 2] + memo[t / 3] + memo[t / 4]), memo[t]);
        return r;
    }

    static long dp(int t) {
        if (memo[t] != -1) {
            return memo[t];
        } else {
            memo[t] = getCoins(t);
        }
        return memo[t];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String name = sc.nextLine();
//        char gender = sc.next().charAt(0);
//        int age = sc.nextInt();
//        long mobileNo = sc.nextLong();
//        double cgpa = sc.nextDouble();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            Arrays.fill(memo, -1);
            memo = new long[n + 1];
            long coins = dp(n);
            System.out.println(coins);
        }
    }
}