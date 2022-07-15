class Solution {
    // Function to return Breadth First Traversal of given graph.
    public void bfs(int i,int[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans)
    {
        Queue<Integer> q=new LinkedList<>(); 
        q.add(i);
        vis[i]=1;                       
        while(!q.isEmpty())
        {
            int node=q.poll();
            ans.add(node);
            for(int it :adj.get(node))  //Traversing all the adj nodes.
            {
                if(vis[it]==0)          //if node not visited add it to the q and mark as visited
                {
                  q.add(it);   
                  vis[it]=1;
                }
                  
            }
        }
    }
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans =new ArrayList<>();
        int[] vis=new int[V];  //For keeping track of visited and unvisited nodes
        bfs(0,vis,adj,ans);
        return ans;
    }
}
