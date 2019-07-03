import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
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
        int n = fs.nextInt();
        int iw = 0;
        String str = null;
        int arr_index = 0;
        char top_elem;

        for (; iw < n; iw++) {
            str = fs.nextLine();
            List<Character> arr = new ArrayList<>();
            Stack<Character> st = new Stack<>();
            int len = str.length();
            Character current_char;
            for (int i = 0; i < len; i++) {
                current_char = str.charAt(i);
                if (current_char < 123 && current_char > 96) {
                    arr.add(current_char);
                } else {

                    if (current_char == ')') {
                        top_elem = st.pop();
                        while (top_elem != '(') {
                            arr.add(top_elem);
                            top_elem = st.pop();
                        }
                    } else {
                        st.push(current_char);
                    }
                }
            }
            String a = "";
            for (char ch : arr) {
                a += ch;
            }
            System.out.println(a);
        }


    }
}