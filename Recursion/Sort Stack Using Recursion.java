//Sort Stack using Recursion
//Solution-->
class Solution{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(!s.empty()){
	
		int temp=s.peek();
		s.pop();
		sort(s);
		insert(s,temp);}
		return s;
		
		
	}
	public Stack<Integer> insert(Stack<Integer> s,int temp)
	{
	    if(s.empty() || s.peek()<=temp)
	    {
	        s.push(temp);
	        return s;
	    }
	    int val=s.peek();
	    s.pop();
	    insert(s,temp);
	    s.push(val);
	    return s;
	}
}
