package Array;

import java.util.Arrays;
import java.util.Scanner;

public class missingNum {
    public static int printNum(int[]arr){
        Arrays.sort(arr);
        if(arr[0]!=0) return 0;
        for(int i=0; i<arr.length; i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {

        int arr[]= new int[3];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans= printNum(arr);
        System.out.println(ans);
    }
}
