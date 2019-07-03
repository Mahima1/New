import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FASHION {
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
        int r;
        for (int p = 1; p <= t; p++) {
            int sum = 0;
            int n = fs.nextInt();
            int[] men = new int[n];
            int[] women = new int[n];

            for (r = 0; r < n; r++) {
                men[r] = fs.nextInt();
            }

            for (r = 0; r < n; r++) {
                women[r] = fs.nextInt();
            }
            Arrays.sort(men);
            Arrays.sort(women);
            for (r = 0; r < n; r++) {
                sum = sum + (men[r] * women[r]);
            }
            System.out.println(sum);
        }
    }
}