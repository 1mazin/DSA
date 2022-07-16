class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int dp[][] =new int[N+1][W+1];
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
               if(wt[i-1]<=j) dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
               else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[N][W];
    }
}
