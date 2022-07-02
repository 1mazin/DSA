



//First Approach Recursion
public class Solution {
	public static int helper(int row,int col,int m, int n) {
		// Write your code here.
        
        if(row==m-1 && col==n-1)
        {
          
          return 1 ;
        }
        if(row>=m ||col>=n)
        {
            return 0;
        }
        int left =helper(row+1,col,m,n);
        int right=helper(row,col+1,m,n);
        return left+right;
	}
        public static int uniquePaths(int m, int n) 
        {
            return helper(0,0,m,n);
        }
}






//Best Approach
class Solution {
    public int uniquePaths(int m, int n) {
        double res=1;
        int k=m+n-2;
        int r=n-1;   //n-1 will also work cuz nCr==nCn-r
        for(int i=1;i<=r;i++)
        {
            res=res*(k-r+i)/i;
        }
        return (int)res;
    }
}
