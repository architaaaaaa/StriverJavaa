package greedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N_meetings {
    static class Meetings{
        int start, end, index;

        Meetings(int s, int e, int i){
            this.start=s;
            this.end=e;
            this.index=i;
        }
    }
    public static void meetings(int start[], int end[], int n){
        Meetings []arr= new Meetings[n];
        for(int i=0; i<n; i++){
            arr[i]=new Meetings(start[i], end[i], i+1);
        }

        Arrays.sort(arr, (a,b) ->{
            if(a.end!=b.end) return a.end - b.end;
            return a.index-b.index;
        });

        ArrayList<Integer> res= new ArrayList<>();
        int lastEnd=-1;

        for(Meetings m: arr){
            if(m.start >lastEnd){
                res.add(m.index);
                lastEnd=m.end;
            }
        }

        for(int i:res){
            System.out.print(i +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int start[]= new int[n];
        int end[]=new int[n];

        for(int i=0;i<n; i++){
            start[i]=sc.nextInt();
        }
        for(int i=0;i<n; i++){
            end[i]=sc.nextInt();
        }

        meetings(start,end,n);
    }
}
