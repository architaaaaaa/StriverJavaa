package greedyAlgo;

import java.util.Arrays;

public class trainPlatform {
    public static int platform(int arrival[], int departure[], int n){
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformCount=1, result=1; //imagine one train already arrived
        int i=1, j=0;
        while(i<n && j<n){
            if(arrival[i]>departure[j]){
                platformCount--;
                j++;
            }
            else if(arrival[i]<=departure[j]){
                platformCount++;
                i++;
            }
            result= Math.max(platformCount,result);
        }
        return result;
    }

    public static void main(String[] args) {

        int arrival[]={900, 945, 955, 1100, 1500, 1800};
        int departure[]={920, 1200, 1130, 1150, 1900, 2000};
        int n=arrival.length;
        int res=platform(arrival,departure,n);
        System.out.println(res);
    }
}
