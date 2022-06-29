
//given an array of ‘N’ integers. You have to find the sum of all the subsets in the non-decreasing order of the given array.
//TC:2^Nlog2^N for sorting and 2^N for recursion-->2^NlogN +2^N
//SC:2^N

class Solution{
    public static void solve(int index,ArrayList<Integer> num,int sum,ArrayList<Integer> ans){
        if(num.size()==index)         
        {
            ans.add(sum);
            return;
        }
    solve(index+1,num,sum+num.get(index),ans);  //Pick
    solve(index+1,num,sum,ans);                 //Not pick
    
        }
    ArrayList<Integer> subsetSums(ArrayList<Integer> num, int N){
        // code here
         ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        solve(0,num,sum,ans);
        Collections.sort(ans);   
        return ans;
    }
}
