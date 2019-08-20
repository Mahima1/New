import java.io.*;
import java.util.*;

public class sansa {

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

    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    static long comb(int n, int r) {
        return (factorial(n) / (factorial(n - r) * factorial(r))) % 1000000007;
    }

    public static void main(String args[]) throws Exception {
        FastReader fs = new FastReader();
        int t = fs.nextInt();

        for (int i = 0; i < t; i++) {
            long ans = 0;
            int r = fs.nextInt();
            int p = fs.nextInt();
            int sansa = (int) (r / (p + 1));
            int n = r - ((int) (r / 2));
            if (n % 2 == 1 && sansa == (n - 1) / 2) {
                ans = (long) (Math.pow(2, n) / 2);
                System.out.println(ans % 1000000007);
            } else if (n % 2 == 0 && sansa == n / 2) {
                long x = comb(n, n / 2);
                ans = (long) ((Math.pow(2, n) + ((x))) / 2);
                System.out.println(ans % 1000000007);
            } else {
                ans = 0;
                for (int i1 = 0; i1 <= sansa; i1++) {
                    ans += comb(n, i1);
                }
                System.out.println(ans);
            }
        }
        //Write code here
    }
}