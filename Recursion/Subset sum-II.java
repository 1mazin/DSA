/*Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.*/


import java.util.*;
class Solution {
    public static void solve(int index, int arr[],ArrayList<Integer> ds,List<List<Integer>> ans)
    {
            int n=arr.length;
            ans.add(new ArrayList<>(ds));
          
        for(int i=index;i<n;i++)
        {
            if(i>index && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);    
            solve(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        solve(0,nums,ds,ans);
        return ans;
    }
}
