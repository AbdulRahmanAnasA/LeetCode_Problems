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
    public boolean isPalindrome(ListNode head) {
        ListNode th=head;
        Stack<Integer> s=new Stack<>();
        while(th!=null){                        //    |   10    |
            s.push(th.val);                     //    |   20    |     FIRST IN LAST OUT TECNIQUE
            th=th.next;                         //    |   20    |
        }                                       //    |___10____| 
        th=head;
        while(th != null){
            if(th.val != s.pop()){
            return false;
            }
            th=th.next;
            }
        return true;
    }
}
    
