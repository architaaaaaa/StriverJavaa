package Array;
import java.util.*;
public class consecuteOnes {
    public static int printOnes(int arr[]){
        int cnt=0;
        int max=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                cnt++;
            }else{
                cnt=0;
            }
            max= Math.max(cnt,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,1,1,4,5};
        int ans= printOnes(arr);
        System.out.println(ans);
    }
}
