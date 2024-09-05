/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       
        ListNode th=head;
        Set<ListNode> s=new HashSet<>();
        while(th != null){
           if(s.contains(th)) return true;
           s.add(th);
           th=th.next;
        }
        return false;
        
    }
}
