import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class primeGenerator {
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
        int t = fs.nextInt();
        int i, a, b;
        for (i = 0; i < t; i++) {
            a = fs.nextInt();
            b = fs.nextInt();
            boolean[] prime = new boolean[b + 1];
            Arrays.fill(prime, true);


            for (int p = 2; p * p <= b; p++) {
                if (prime[p] == true) {

                    for (int r = p * p; r <= b; r += p)
                        prime[r] = false;
                }
            }

            int start = a < 2 ? 2 : a;
            for (int w = start; w <= b; w++) {
                if (prime[w] == true)
                    System.out.println(w);
            }
            System.out.println();
        }
    }
}