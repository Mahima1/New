import java.util.HashMap;


public class sumOfTwoNumbers {

    private static void hashmap(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], sum - arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum - arr[i])) {
                System.out.printf(" (%d, %d) ",map.get(sum - arr[i]), sum-arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 5;
        hashmap(arr, sum);
    }
}
