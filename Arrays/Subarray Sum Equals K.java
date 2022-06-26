//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

class Solution {
    public int subarraySum(int[] a, int k) {
    int n=a.length;
    Map<Integer,Integer> prefixs =new HashMap<>();
    int sum=0;//to track currentsum
    int result=0;//stores result
    //first put zero sum int map i.e (0,1)
     prefixs.put(0,1);
    for(int i=0;i<n;i++)
    {
        sum+=a[i];
        
        if(prefixs.containsKey(sum-k))
        {
            result+=prefixs.get(sum-k);
        }
       
            prefixs.put(sum,prefixs.getOrDefault(sum,0)+1);
        
    
        }
    
        return result;
    }
}
