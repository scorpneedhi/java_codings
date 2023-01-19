/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {        
        int rem=0;

        ListNode ans;
        ListNode temp;

        if(l1 != null && l2 != null)
        {
            temp=ans= new ListNode( (l1.val + l2.val) % 10);
            rem=(l1.val + l2.val) / 10;
            l1=l1.next;
            l2=l2.next;
        }
        else if(l1 != null)
        {
            temp=ans= new ListNode( l1.val % 10);
            rem=l1.val / 10;
            l1=l1.next;
            if(l1 == null && rem > 0)
            {
                temp.next = new ListNode(rem);
                temp=temp.next;
            }
        }
        else
        {
            temp=ans= new ListNode( l2.val % 10);
            rem=l2.val / 10;
            l2=l2.next;
            if(l2 == null && rem > 0)
            {
                temp.next = new ListNode(rem);
                temp=temp.next;
            }
        }
        while(l1 != null || l2 != null)
        {
            if(l1 != null && l2 != null)
            {
                temp.next = new ListNode((l1.val + l2.val + rem) % 10);
                rem=(l1.val + l2.val + rem) / 10;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1 != null)
            {
                temp.next = new ListNode((l1.val + rem) % 10);
                rem=(l1.val + rem) / 10;
                l1=l1.next;
            }
            else if(l2 != null)
            {
                temp.next = new ListNode((l2.val + rem) % 10);
                rem=(l2.val + rem) / 10;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(rem > 0)
        {
            temp.next = new ListNode(rem);
            temp=temp.next;
        }
        return ans;
    }
}
