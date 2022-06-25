class Solution
{
    //Function to delete middle element of a stack.
  public void deleteMid(Stack<Integer>s,int sizeOfStack)
   {
       Integer a = null;
       if(s.size() == Math.ceil((sizeOfStack + 1)/2))
       {
           s.pop();
           return;
       }
       else
       {
           a = s.pop();
           deleteMid(s, sizeOfStack);
           
       }
       if(a != null)
           s.push(a);
   } 
  
}
