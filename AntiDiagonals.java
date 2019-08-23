import java.util.ArrayList;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int x = 0, y = 0;
        int xx = 0, yy = 0;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 1; i <= (2 * n) - 1; i++) {

            // System.out.println("x: "+x+"y: "+y+"i: "+i);
            xx = x;
            yy = y;
            ArrayList<Integer> list = new ArrayList<>();

            while (xx >= 0 && yy >= 0 && xx <= n - 1) {
                list.add(A.get(xx).get(yy));
                ++xx;
                --yy;
            }

            if (i >= n) {
                y = n - 1;
                x = (x + 1) % n;
            }

            if (i < n) {
                x = 0;
                y = (y + 1) % n;
            }

            arr.add(list);
        }

        return arr;

    }

}
