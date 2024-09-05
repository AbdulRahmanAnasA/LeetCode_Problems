/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode th1=headA;
        ListNode th2=headB;
        Set<ListNode> s= new HashSet<>();
        while(th1 != null){
            s.add(th1);
            th1=th1.next;
        }
        while(th2 != null){
            if(s.contains(th2)) return th2;
            th2=th2.next;
        }
        return null;
        
    }
}
