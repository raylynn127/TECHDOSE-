class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2; //if anyone of the list is empty then returning the other list
        if(list2==null) return list1;
        ListNode dummy=new ListNode(0); //creating a sentinel node
        ListNode temp=dummy; //making a temp node
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val) //if value in list1 is less
            {
                temp.next=list1; //adding list1 node to temp
                list1=list1.next;
            }
            else //if value in list2 is less
            {
                temp.next=list2; //adding list2 node to temp
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1==null) //if list2 has some node not visited then it is added to temp.next
        {
            temp.next=list2;
        }
        else //if list1 has some node not visited then it is added to temp.next
        {
            temp.next=list1;
        }
        return dummy.next;
    }
}