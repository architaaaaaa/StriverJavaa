package binarySearch;
import java.util.*;
public class binarySearching {
    public static int search(int arr[], int target, int left, int right){
        if(left>right) return -1;
        int mid=left+(right-left)/2;

        if(arr[mid]==target)return mid;
        else if(arr[mid]<target) return search(arr,target,mid+1,right);
        else{
            return search(arr,target,left,mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,9};
        Arrays.sort(arr);

        int ans =search(arr, 1,0,arr.length-1);
        if(ans==-1){
            System.out.println("not found");
        }else{
            System.out.println(ans);
        }
    }
}
