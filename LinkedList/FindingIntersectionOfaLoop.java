public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&slow!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) //Loop found
            {
                fast=head; //making one pointer points to the head
                while(fast!=slow)
                {
                    slow=slow.next; //Making the pointers jump by one step at a time
                    fast=fast.next; //Making the pointers jump by one step at a time
                }
                return slow; //slow and head will points to the intersection node where the loop starts
            }
        }
        return null; //if there is no loop
    }
}