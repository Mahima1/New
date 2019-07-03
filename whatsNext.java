import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class whatsNext {
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

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int a = fs.nextInt();
        int b = fs.nextInt();
        int c = fs.nextInt();
        while (a != 0 | b != 0 | c != 0) {
            String XX = null;
            int num = 0;
            if (b == (a + c) / 2.0) {
                XX = "AP";
                num = (2 * c - b);
            } else {
                XX = "GP";
                num = c * (b / a);
            }
            a = fs.nextInt();
            b = fs.nextInt();
            c = fs.nextInt();
            System.out.println(XX + " " + num);
        }
    }
}