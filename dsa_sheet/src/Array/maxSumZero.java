package Array;
import java.util.*;
public class maxSumZero {
    public static int printSum(int arr[]){
        int n=arr.length;
        if(n==0) return 0;
        HashMap<Integer,Integer>map= new HashMap<>();
        int sum=0, maxi=0;
        for(int i=0; i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }else{
                if(map.get(sum)!=null){
                    maxi= Math.max(maxi,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[]={5,-2,2,-3,3,-5};
        int ans=printSum(arr);
        System.out.println(ans);
    }
}
