import java.util.ArrayList;
import java.util.Scanner;

public class Flip {
    public static ArrayList<Integer> flip(String A) {
        int len = A.length();
        int max = Integer.MIN_VALUE, maxtillnow = 0, l = 0, r = 0;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            if (A.charAt(i) == '1') {
                arr[i] = -1;
            }
            if (A.charAt(i) == '0'){
                arr[i] = 1;
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.printf("%d ", arr[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (maxtillnow + arr[i] >= arr[i]) {
                ++r;
                maxtillnow = maxtillnow + arr[i];
            }
            if (arr[i] > maxtillnow + arr[i]) {
                maxtillnow = arr[i];
                l = i;
                r = i;
            }


            if (max < maxtillnow) {
                max = maxtillnow;
                System.out.println("max is : "+max);
            }
            if (max <= 0) {
                return ans;
            }

        }

        ans.add(l + 1);
        ans.add(r + 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println(flip(A));
    }
}
