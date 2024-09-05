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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,nextNode=null,curr=head;

        while(curr != null){
            nextNode=curr.next;
            curr.next=prev;  //for breaking the  line like ,for the first loop 1-> null
            prev=curr;                                      //2nd loop 2 -> 1,
            curr=nextNode;                                   //3rd loop 3 -> 2 -> 1
        }                                                    //4th loop  4->3->2->1
        return prev;
        
    }
}
