package ReversedLinkedListPalindrome;

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
        if(head == null) return true;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode tmp = reversedLinkedList(slow);

        while(tmp != null) {
            if(tmp.val != head.val){
                return false;
            }else {
                tmp = tmp.next;
                head = head.next;
            }
        }
        return true;
    }

    public ListNode reversedLinkedList(ListNode root){

        ListNode output = null;
        while(root != null){
            ListNode tmp = root.next;
            root.next = output;
            output = root;
            root = tmp;

        }
        return output;
    }
}