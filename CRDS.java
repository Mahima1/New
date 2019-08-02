import java.util.*;

public class CRDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long cards = n * 2;
//            cards %= 1000007;
            cards += (((3 * n * n) / 2) - ((3 * n) / 2));
            cards = cards % 1000007;
            System.out.println(cards);
        }
    }
}