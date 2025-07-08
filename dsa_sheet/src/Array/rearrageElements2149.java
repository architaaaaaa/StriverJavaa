package Array;
import java.util.*;
public class rearrageElements2149 {
    public static int[] printEle(int nums[]){
        int n=nums.length;
        ArrayList<Integer>arr1= new ArrayList<>();
        ArrayList<Integer>arr2= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        for(int i=0; i<n/2; i++){
            nums[2*i]=arr2.get(i);
            nums[2*i+1]=arr1.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[]={1,2,-4,-5};
        int ans[]=printEle(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
