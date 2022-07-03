//First Approach-Iterative

class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode prev=null;
     ListNode curr=head;
     while(curr!=null)
     {
         ListNode temp=curr.next;
         curr.next=prev;
         prev=curr;
         curr=temp;
         
     }
        
        return prev;
    }
}

//Second approach using Recursion
class Solution {
    public ListNode reverseList(ListNode head) {
    if(head==null ||head.next==null)
        return head;
     //ListNode prev=null;
    // ListNode curr=head;
    ListNode newNode=reverseList(head.next);
    ListNode newHead=head.next;
    newHead.next=head;
    head.next=null;
    
    return newNode;
}
}
