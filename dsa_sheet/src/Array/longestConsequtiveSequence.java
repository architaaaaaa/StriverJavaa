package Array;
import java.util.*;

public class longestConsequtiveSequence {
    public static int printNum(int arr[]){
        int n= arr.length;
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        int longest=1;
        for(int num: set){
            if(!set.contains(num-1)){
                int cnt=1;
                int x=num;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
//    public static int longestConsecutive(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int num : nums) {
//            list.add(num);
//        }
//        Collections.sort(list);
//
//        int maxCount = 1;
//        int currentCount = 1;
//
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i + 1) - list.get(i) == 1) {
//                currentCount++;
//                maxCount = Math.max(maxCount, currentCount);
//            } else if (list.get(i + 1) - list.get(i) > 1) {
//                currentCount = 1; // Reset if not consecutive
//            }
//        }
//        return maxCount;
//    }

    public static void main(String[] args) {
        int[] arr = {102, 3, 2, 101, 1, 109, 4, 5};
        int ans = printNum(arr);
        System.out.println("Longest consecutive sequence length: " + ans);
    }
}