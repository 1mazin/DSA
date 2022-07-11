/*Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked-list is in sorted order.
Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order. */


class GfG
{
    Node merge(Node a ,Node b)
    {
        Node ans=new Node(0);
        Node temp=ans;
        while(a!=null && b!=null)
        {
            if(a.data<b.data)
             {
                 temp.bottom=a;
                 temp=a;
                 a=a.bottom;
             }
              else
             {
                 temp.bottom=b;
                 temp=b;
                  b=b.bottom;
             }
        }
        while(a!=null)
        {
           
                 temp.bottom=a;
                 temp=a;
                 a=a.bottom;
             
        }
        while(b!=null)
        {
             
                  temp.bottom=b;
                  temp=b;
                  b=b.bottom;
             
        }
        return ans.bottom;
    }
    Node flatten(Node root)
    {
	// Your code here
	if(root==null ||root.next==null)
	return root;
	
  root.next=flatten(root.next);
	root=merge(root,root.next);
	return root;
    }
}
