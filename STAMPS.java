import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class STAMPS {
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


    static void sort(int arr[]) {
        int n = arr.length;


        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);


        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();
        for (int i = 0; i < n; i++) {
            int stamps = fs.nextInt();
            int frndsNeeded = 0;
            int frnds = fs.nextInt();
            int[] arr = new int[frnds];
            for (int p = 0; p < frnds; p++) {
                arr[p] = fs.nextInt();
            }
            sort(arr);
            for (int t = arr.length-1 ;t >=0; t--) {
                if (stamps > 0) {
                    stamps -= arr[t];
                    frndsNeeded++;
                } else {
                    break;
                }
            }
            if (stamps <= 0) {
                System.out.printf("Scenario #%d:\n%d\n", i + 1, frndsNeeded);
            } else {
                System.out.printf("Scenario #%d:\nimpossible\n",i+1);
            }

        }

    }
}