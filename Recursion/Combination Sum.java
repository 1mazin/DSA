Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
 You may return the combinations in any order.




class Solution {
  public static void solve(int index, int[] a,int target, List<List<Integer>> ans,ArrayList<Integer> ds)
    {
        
        if(index==a.length){
           if(target==0){
            ans.add(new ArrayList<>(ds)); //will take Linear time for insertion}
            }return;
            }
        if(a[index]<=target)  //Add the elemrnt only if it is smaller or equal to current target value;
        {
            ds.add(a[index]);
            solve(index,a,target-a[index],ans,ds);//picking the same index;
            ds.remove(ds.size()-1);  //last inserted element removed
            
        }
       solve(index+1,a,target,ans,ds) ; //picking the next that is  not picking the same index again
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>>  ans =new  ArrayList<>();
        ArrayList<Integer> ds =new ArrayList<>();
        solve(0,candidates,target,ans,ds
             );
         return ans;
    }
}

