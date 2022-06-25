/*
APPROACH:
For row n, it would have pow(2,n-1) no. of elements.
k would always lie from 1 to pow(2,n-1).
Say n=5 then grammar is
0
0 1
0 1 1 0
0 1 1 0 1 0 0 1
0 1 1 0 1 0 0 1 1 0 0 1 0 1 1 0

If above grammar is observed carefully, for every row say nth having pow(2,n-1) elements, 
1st half elements of nth row will be same as of all (n-1)th row elements.
2nd half elements of nth row will be compliment of all n-1th row elements
For example if we take n=4,k=5  solution would be equal to that of n=3,k=1
*/


class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1 && k==1)        {
           return 0;
        }
        int mid=(int)(Math.pow(2,n-1)/2);
        if(k<=mid)
            return kthGrammar(n-1,k);
        else
             return ((kthGrammar(n-1, k-mid))^1);
        //return 0;
    }
}
