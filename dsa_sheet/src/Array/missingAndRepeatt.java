package Array;
import java.util.HashSet;
import java.util.Set;

public class missingAndRepeatt {
    public static int[] printAns(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        int missing = -1;

        // Find repeating number
        for (int num : arr) {
            if (set.contains(num)) {
                repeat = num;
            }
            set.add(num);
        }

        // Find missing number
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeat, missing};
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 3};
        int[] result = printAns(a);
        System.out.println("Repeating: " + result[0] + ", Missing: " + result[1]);
    }
}