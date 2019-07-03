import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Candy_I {
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
        int packs = fs.nextInt();
        int i, candies, sum, moves, div, candyNeeded;
        while (packs > 0) {
            moves = 0;
            sum = 0;
            int[] arr = new int[packs];
            for (i = 0; i < packs; i++) {
                candies = fs.nextInt();
                if (candies < 1) {
                    moves = -1;
                }
                arr[i] = candies;
                sum += candies;
            }
            div = sum % packs;
            for (i = 0; i < packs; i++) {
                if (div == 0 & moves != -1) {
                    candyNeeded = sum / packs;
                    if (arr[i] < candyNeeded) {
                        moves = moves + (candyNeeded - arr[i]);
                    }

                } else {
                    moves = -1;
                }
            }
            System.out.println(moves);
            packs = fs.nextInt();
        }
    }
}
