package greedyAlgo;

import java.util.ArrayList;

public class NumOfCoinsCount {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        int V=71;
        System.out.println("coins to get "+V+":");
        int coins[]={1,2,5,10,20,50,100,500,2000};
        int n=coins.length;

        for(int i=n-1;i>=0;i--){
            while(V>=coins[i]){
                V-=coins[i];
                list.add(coins[i]);
            }
        }
        System.out.println("size: " +list.size());
        System.out.println("coins: ");
        for(int i=0; i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
