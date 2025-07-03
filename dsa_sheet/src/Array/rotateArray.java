package Array;
import java.util.*;
public class rotateArray {
    public static void rotate(int arr[], int k){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            list.add(arr[i]);
        }
        Collections.rotate(list,k);
        for(int i=0; i< arr.length;i++){
            arr[i]= list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[7];
        for( int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr,3);
    }
}
