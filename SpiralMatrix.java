import java.util.*;
import java.lang.*;

public class SpiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
//        int m = (int) Math.sqrt(A);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
//        int[][] arr = new int[A][A];

        for (int i = 0; i < A; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(temp);
            for (int t = 0; t < A; t++) {
                list.get(i).add(t, 0);
            }
        }
//        System.out.println(list);


        int dir = 0;
        int top = 0;
        int left = 0;
        int right = A - 1;
        int bot = A - 1;
        int i = 1;
        while (top <= bot) {
            if (dir == 0) {// L to R top++
                for (int p = left; p <= right; p++) {
//                    System.out.println("p is : " + p + " in dir " + dir);
                    list.get(top).set(p, i);
                    i++;
                }
                top++;


            } else if (dir == 1) { //top to bot right--
                for (int q = top; q <= bot; q++) {
//                    System.out.println("p is : " + q + " in dir " + dir);
                    list.get(q).set(right, i);
                    i++;
                }
                right--;


            } else if (dir == 2) {//R to L Bot --
                for (int k = right; k >= left; k--) {
//                    System.out.println("p is : " + k + " in dir " + dir);
                    list.get(bot).set(k, i);
                    i++;
                }
                bot--;

            } else if (dir == 3) { //bot to top left++
                for (int z = bot; z >= top; z--) {
//                    System.out.println("p is : " + z + " in dir " + dir);
                    list.get(z).set(left, i);
                    i++;
                }
                left++;
            }
            dir = (dir + 1) % 4;

        }
        System.out.println(list);

    }
}
