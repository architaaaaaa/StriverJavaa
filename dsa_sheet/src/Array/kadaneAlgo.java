package Array;

public class kadaneAlgo {
    public static int subArraySum(int arr[]){
        int n=arr.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum+=arr[i];
            maxi= Math.max(sum, maxi);

            if(sum<0) sum=0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int ans= subArraySum(arr);
        System.out.println(ans);
    }
}
