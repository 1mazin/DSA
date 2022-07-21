//Tabulation method
class Solution {
    int dp[][] =new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
  
        //Initializing matrix with 1; 
           int n=text1.length();
        int m=text2.length();
      

        return helper(text1,text2,n,m);
        
        
    }
    public int helper(String s,String p,int n,int m)
    {
   
          for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                 
       
                       if(s.charAt(i-1)==p.charAt(j-1)) 
                          dp[i][j]= 1+dp[i-1][j-1];
                       else
                         dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                    
            }
        }
        return dp[n][m];
     

    }
}
