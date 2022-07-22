class Solution{
    static int solver(int arr[],int i,int j)
    {
        if(i>=j)return 0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int left =solver(arr,i,k);
            int right=solver(arr,k+1,j);
            int cost=left+right+arr[i-1]*arr[k]*arr[j];
            min=Math.min(min,cost);
        }
        return min;
    }
    static int matrixMultiplication(int N, int arr[])
    {

        return solver(arr,1,arr.length-1);
    }
}
