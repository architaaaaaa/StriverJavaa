package Array;
import java.util.*;
public class arrSortedANDRotate {
    public static boolean isSort(int arr[]){
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]> arr[(i+1)% arr.length]){
                count ++;
            }
            if(count>1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        boolean ans= isSort(arr);
        System.out.println(ans);
    }
}
