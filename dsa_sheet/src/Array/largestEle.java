package Array;

import java.lang.reflect.Array;
import java.util.*;

public class largestEle {
    public static void main(String[] args) {
        int arr[]= new int[4];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>arr[i+1]){
//                int high= Math.max(arr[i], arr[i+1]);
//                max=high;
//            }
//        }
        Arrays.sort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        HashSet<Integer>set= new HashSet<>();
        for(int i=0; i< arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
        Integer arr1[]= set.toArray(new Integer[set.size()]);
        if(arr1.length < 2){
            System.out.println("-1");
        }
        System.out.println("largest:"+ arr1[arr1.length-1]);
        System.out.println("seclargest:"+ arr1[arr1.length-2]);
    }
}
