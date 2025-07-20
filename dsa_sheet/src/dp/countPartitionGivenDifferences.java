package dp;

public class countPartitionGivenDifferences {
    static int mod=(int)(Math.pow(10,9)+7);
    public static int countPartition(int arr[], int d){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n; i++){
            sum+=arr[i];
        }
        if(sum-d<0 || (sum-d)%2!=0) return 0;
        return findways(arr,(sum-d)/2);
    }
    public static int findways(int arr[], int target){
        int n=arr.length;
        int dp[][]= new int[n][target+1];

        if(arr[0]==0) dp[0][0]=2;
        else dp[0][0]=1;
        if(arr[0]!=0 && arr[0]<=target) dp[0][arr[0]]=1;

        for(int i=1; i<n; i++){
            for(int j=0; j<=target; j++){
                int NotTake=dp[i-1][j];
                int take=0;
                if(j>=arr[i]){
                    take=dp[i-1][j-arr[i]];
                }
                dp[i][j]=(take+NotTake)%mod;
            }
        }
        return dp[n-1][target];
    }

    public static void main(String[] args) {
        int arr[]={5,2,6,4};
        int d=1;
        int ans=countPartition(arr,d);
        System.out.println(ans);
    }
}
