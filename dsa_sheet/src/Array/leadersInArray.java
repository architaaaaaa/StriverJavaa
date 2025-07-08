package Array;
import java.util.*;
public class leadersInArray {
    public static List<Integer> printArray(int  arr[]){
        ArrayList<Integer> lead= new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        lead.add(max);

        for(int i=n-2; i>=0; i--){
            if(arr[i]> max){
                lead.add(arr[i]);
                max=arr[i];
            }
        }
        return lead;
    }

    public static void main(String[] args) {
        int arr[]={10, 22, 12, 3, 0, 6};
        List<Integer> ans= printArray(arr);
        Collections.sort(ans);
        Collections.reverse(ans);
        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
