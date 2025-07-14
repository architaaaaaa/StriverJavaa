package greedyAlgo;

import java.util.Arrays;

public class knapsackFractional {
    static class Items{
        int value;
        int weight;
        Items(int v, int w){
            this.value=v;
            this.weight=w;
        }
    }
    public static double calculateValue(Items[] arr, int capacity){
        Arrays.sort(arr,(a,b)->{
            double r1=(double) a.value/a.weight;
            double r2=(double) b.value/b.weight;
            return Double.compare(r2,r1);
        });

        double totalValue=0.0;
        int currWeight=0;

        for(Items it: arr){
            if(currWeight+ it.weight<= capacity){
                currWeight+=it.weight;
                totalValue+=it.value;
            }else{
                int remain=capacity-currWeight;
                totalValue+=((double) it.value / it.weight)* remain;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Items[] arr={ new Items(60,10),
        new Items(100,20),
        new Items(120,30)};

        int capacity=50;
        double ans= calculateValue(arr,capacity);
        System.out.println(ans);
    }
}
