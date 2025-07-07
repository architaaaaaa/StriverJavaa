package Array;

import java.util.*;

public class SinleNum136 {
    public static int printNum(int nums[]){
        HashMap<Integer, Integer>map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val= map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,2,3,1};
        int ans= printNum(nums);
        System.out.println(ans);
    }
}
