package greedyAlgo;

import java.util.Arrays;

public class jobSchedular {
    static class Job{
        int id, deadline, profit;
        Job(int i, int d, int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;
        }
    }
    public static int[] jobSchedule(Job[]jobs, int n){
        Arrays.sort(jobs,(a,b) -> b.profit-a.profit);

        int deadlineMax=0;
        for(Job j:jobs){
            deadlineMax=Math.max(deadlineMax,j.deadline);
        }

        int slots[]= new int[deadlineMax+1];
        Arrays.fill(slots,-1);

        int count=0, totalProfit=0;
        for(Job j: jobs){
            for(int i=j.deadline; i>0; i--){
                if(slots[i]==-1){
                    slots[i]=j.profit;
                    count++;
                    totalProfit+=j.profit;
                    break;
                }
            }
        }
        return new int[]{count,totalProfit};
    }

    public static void main(String[] args) {
        Job[] j = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 2, 40),
                new Job(4, 2, 30)
        };

        jobSchedular scheduler = new jobSchedular();
        int[] result = scheduler.jobSchedule(j, j.length);

        System.out.println("Jobs done: " + result[0]);
        System.out.println("Total profit: " + result[1]);
    }
}
