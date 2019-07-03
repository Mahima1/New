import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TOANDFRO {
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
        int col = fs.nextInt();
        while (col != 0) {
            String msg = fs.nextLine();
            int msglen = msg.length();
            char[] matrix = new char[msglen];
            int startIndex = 0, count = 0;
            int rows = msglen / col;

            int[] oparr = new int[rows];
            for (int h = 0; h < rows; h++) {
                if (h % 2 == 0) {
                    oparr[h] = 1;
                } else {
                    oparr[h] = -1;
                }
            }

            int i = 0;
            for


            col = fs.nextInt();
            System.out.println(matrix);
        }
    }
}