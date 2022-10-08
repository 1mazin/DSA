/*
**Problem**
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.


**Solution Approach**
//BruteForce : We can generate all possible subarrays of size 3 and compute the difference of the tatrget and the sum of the three elements in a subarray.
The result would be the one with the minimum difference;
TC:O(n^3)
//Optimized :We can sort the array,then fix the first element and on the remaining part we can apply two ponter technique for choosing the other two elements 
TC:O(n^2)

*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        boolean ans=false;
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            while(start<end)
            {
                int curr=nums[i]+nums[start]+nums[end];
               
                if(curr<target)
                 start++;
                else if(curr>target)
                 end--;
                else if(curr==target)
                {
                    ans =true;
                    
                    break;
                }
                 if(Math.abs(curr-target)<min){
                     min=Math.abs(curr-target);
                     res=curr;
                 }
            }
            if(ans)break;
        }
        if(ans)return target;
        else return res;
        
    }
}
