import java.util.ArrayList;

public class firstMissingPositive {
    public void swap(ArrayList<Integer> A, int a, int b) {
        int temp = A.get(a);
        A.set(a, A.get(b));
        A.set(b, temp);
    }

    public ArrayList<Integer> driver(ArrayList<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);
            if (num > 0 && num <= A.size()) {
                int index = num - 1;
                if (A.get(index) != num) {
                    swap(A, index, i);
                    i--;
                }
            }
        }
        return A;

    }

    public int fmp(ArrayList<Integer> A) {

        ArrayList<Integer> ans = driver(A);

        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) != i + 1) {
                return i + 1;
            }
        }
        return ans.size() + 1;
    }
}
