class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode curr=head;
        if(curr==null||curr.next==null) return curr; //finding the last node of the given linkedlist during recursive call and returning last node to the curr
        ListNode ptr=reverseList(curr.next); //sending the curr.next as a recursive call
        curr.next.next=curr; //curr node next node points to the curr node (ex: let curr=(last-1) node ,curr.next.next(last node) points to the curr node(last-1 node))
        curr.next=null; //curr node next = null breaking the link
        return ptr; //return ptr
    }
}
