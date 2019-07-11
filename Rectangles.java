import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Rectangles {
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

    static long rects(long n) {
        if (n <= 3) {
            return n;
        }
        long rect = n;
        long row = 2, col = 2;
        long mult = 4;
        while (true) {
            System.out.println("a: " + row + " b: " + col);
            mult = row * col;

            if (mult <= n) {
                ++rect;
            }

            ++col;

            if (mult > n) {
                ++row;
                col = row;
                if ((row * col) > n) {
                    return rect;
                }
            }
        }
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        long n = fs.nextLong();
        long result = rects(n);
        System.out.println(result);
    }
}