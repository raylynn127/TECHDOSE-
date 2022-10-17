class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>(); //creating a list to add elements
        ListNode temp=head;
        while(temp!=null) //while temp != null
        {
            list.add(temp.val); // adding node val in the list
            temp=temp.next; //temp pointing to next node
        }
        int left=0,right=list.size()-1;
        while(left<right){
            if(!list.get(left).equals(list.get(right))) // if not equal then it is not a palindrome
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}