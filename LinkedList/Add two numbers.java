/*given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l3=new ListNode();
    ListNode ans=l3;
    int carry=0;
    while(l1!=null || l2!=null ||carry==1 )
    {
    int value=0;
    if(l1!=null)
        {
            value+=l1.val;
            l1=l1.next;
        }
    
    
    if(l2!=null){
    value+=l2.val;
     l2=l2.next;
    }
    value+=carry;
    carry=value/10;
    l3.next=new ListNode(value%10);
    l3=l3.next;
  
    }
 
   
    return ans.next;
    }
}
