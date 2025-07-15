package recursion;
import javax.security.auth.Subject;
import java.util.*;
public class subset {
    public static void subSet(int arr[], int indx, ArrayList<Integer> list){
        if(indx==arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[indx]);
        subSet(arr,indx+1, list);
        list.remove(list.size()-1);
        subSet(arr,indx+1,list);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        subSet(arr,0,new ArrayList<>());
    }

}
