import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HANGOVER {
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
        Double c = fs.nextDouble();
        while (c != 0.00) {
            Double n = 2.00;
            int cards = 0;
            if (c <= 0.50) {
                System.out.println(1 + " card(s)");
            } else {
                Double sum = 0.00;
                while (sum < c) {
                    Double reciprocal = 1 / n;
//                    Double roundOff = Math.round(reciprocal * 100.0) / 100.0;
                    sum = sum + reciprocal;
                    n++;
                    cards++;
                }
                System.out.println(cards + " card(s)");
            }
            c = fs.nextDouble();
        }
    }
}
