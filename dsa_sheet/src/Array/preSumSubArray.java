package Array;

import java.util.HashMap;

public class preSumSubArray {
    public static int printSum(int arr[],int k){
        HashMap<Integer, Integer> map= new HashMap<>();
        int sum=0;
        int maxLength=0;
        int n=arr.length;

        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum==k){
                maxLength= Math.max(maxLength,i+1);
            }
            int remaining= sum-k;
            if(map.containsKey(remaining)){
                int length= i-map.getOrDefault(remaining,0);
                maxLength= Math.max(maxLength,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int k=5;
        int ans=printSum(arr,k);
        System.out.println(ans);
    }
}
