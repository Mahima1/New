import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.BigInteger;

public class smallFactorials {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static BigInteger fact(BigInteger n) {
//        BigInteger n=BigInteger.valueOf(a);
        if (n.equals(BigInteger.valueOf(1))) {
            return BigInteger.valueOf(1);
        }
        if (n.equals(BigInteger.valueOf(0))) {
            return BigInteger.valueOf(0);
        } else {
//            BigInteger i= new BigInteger("1");
            return fact(n.subtract(BigInteger.valueOf(1))).multiply(n);
        }

    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        int i = 0;
        int n;
        for (; i < t; i++) {
            n = fs.nextInt();
            System.out.println(fact(BigInteger.valueOf(n)));
        }


    }
}