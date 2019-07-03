import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class number_steps {
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
        int i = 0;
        for (; i < t; i++) {
            int point = -1;
            int x = fs.nextInt();
            int y = fs.nextInt();
//            System.out.println("X is:"+x +"Y is :"+y);
            if (x == y) {
//                System.out.println("yes x==y");
                if (x % 2 == 0) {
//                    System.out.println("x is even ");
                    point = x * 2;
                } else {
//                    System.out.println("x is odd ");
                    point = (x * 2) - 1;
                }
            }

            if (y == x - 2) {
                if (x % 2 == 0) {
                    point = x + y;
                } else {
                    point = x + y - 1;
                }
            }

            if (point != -1) {
                System.out.println(point);
            } else {
                System.out.println("No Number");
            }

        }

    }
}