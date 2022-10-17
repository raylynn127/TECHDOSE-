public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next; //slow pointer jump one step at a time
            fast=fast.next.next; //fast pointer jump two step at a time
            if(slow==fast) return true; //at some point both slow and fast meet each other if loop is present ,so return true
        }
        return false;
    }
}