class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=curr.next;
        while(curr!=null){
            next=curr.next; //storing curr.next in next
            curr.next=prev; //making curr.next pointing to prev
            prev=curr; //updating prev to curr
            curr=next; //updating curr to next
        }
        head=prev; //atlast making head point to last element(prev)
        return head;
    }
}