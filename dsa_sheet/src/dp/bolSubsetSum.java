package dp;

public class bolSubsetSum {
    public static boolean subset(int arr[], int k){
        int n=arr.length;
        boolean dp[][]= new boolean[n][k+1];

        for(int i=0; i<n; i++){
            dp[i][0]=true;
        }
        if(arr[0]<=k){
            dp[0][arr[0]]=true;
        }

        for(int idx=1;idx<n;idx++){
            for(int target=0; target<=k; target++){
                boolean notTaken=dp[idx-1][target];
                boolean taken=false;
                if(target>=arr[idx]){
                    taken=dp[idx-1][target-arr[idx]];
                }
                dp[idx][target]=taken||notTaken;
            }
        }
        return dp[n-1][k];

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=11;
        if(subset(arr,k)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
