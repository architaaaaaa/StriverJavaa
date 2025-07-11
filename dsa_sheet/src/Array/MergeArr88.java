package Array;
import java.util.*;
public class MergeArr88 {
    public static void printArr(int nums1[], int n, int nums2[], int m){
//        ArrayList<Integer> list= new ArrayList<>();
//        for(int i=0; i<n; i++){
//            list.add(arr1[i]);
//        }
//        for(int i=0; i<m; i++){
//            list.add(arr2[i]);
//        }
//        if(list.contains(0)){
//            list.remove();
//        }
//
//        Collections.sort(list);
//        Integer arr[]=list.toArray(new Integer[list.size()]);
//
//        System.out.println(Arrays.toString(arr));
        int i = m - 1;      // pointer for nums1
        int j = n - 1;      // pointer for nums2
        int k = m + n - 1;  // pointer for merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If any elements left in nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        System.out.println(nums1.toString());

    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};
        int n=3, m=3;
        printArr(arr1,n,arr2,m);
    }
}
