import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AP2 {
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

    }
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        for (int i = 0; i < t; i++) {
            long first3 = fs.nextLong();
            long last3 = fs.nextLong();
            long sum = fs.nextLong();
            long y = (2 * sum) / (first3 + last3);
            int n = (int) y;
            long d = (last3 - first3) / (n - 5);
            long a = first3 - (2 * d);
            System.out.println(n);
            for (int q = 0; q < n; q++) {
                System.out.printf("%d ", a + (q * d));
            }
        }
    }
}