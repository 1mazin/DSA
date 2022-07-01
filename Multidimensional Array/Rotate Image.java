 //Given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//Solution->Transpose the matrix and tehn reverse each row.

class Solution {
  static void reverse(int a[])
    {
        int n=a.length;
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  }
    public void rotate(int[][] matrix) {
    
   ///for finding transpose
        for(int i=0;i<matrix.length;i++)
        {
            
            for(int j=0;j<i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
         for(int i=0;i<matrix.length;i++)
        {
          
            reverse(matrix[i]);
        }
      
    }
}
