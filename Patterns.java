import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Patterns {
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

    static long factorial(int n, int y) {
        long ans = 1;
        for (int q = n; q > y; q--) {
            ans *= q;
        }
        return ans;
    }

    static long fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int position(int[] a) {
        int i = 0;
        while (a[i] >= i + 1) {
            i++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            a[i] = fs.nextInt();
        }


        for (int i = 0; i < n + 1; i++) {
            int pos = i + 1;

            if (pos == 1) {
                System.out.println(n);
            } else if (pos == n + 1) {
                System.out.println(1);
            } else if (pos == 2) {
                long res = (long) factorial(n, 2) / fact(n - 2);
                res = res - position(a);
                res = res % 1000000007;
                System.out.println(res);

            } else {
                long res = (long) factorial(n, pos) / fact(n - pos);
                res = res % 1000000007;
                System.out.println(res);
            }

        }


    }
}