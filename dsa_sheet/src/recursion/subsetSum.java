package recursion;
import java.util.*;

public class subsetSum {
    public static void printList(int arr[], int sum, int index, ArrayList<Integer>list, int n){
        if(index==n){
            list.add(sum);
            return;
        }
        printList(arr,sum+arr[index],index+1,list,n);
        printList(arr,sum,index+1,list,n);
    }
    public static ArrayList<Integer> printS(int n,int arr[]){
        ArrayList<Integer> list= new ArrayList<>();
        printList(arr,0,0,list,n);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        int arr[]={3,1,2};
        int n=arr.length;
        list= printS(n,arr);

        Collections.sort(list);
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
