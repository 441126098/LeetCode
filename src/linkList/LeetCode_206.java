package linkList;


import java.util.*;

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
public class LeetCode_206 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        new LeetCode_206().reverseList(head);
    }
    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode next;
//        ListNode curr = head;
//        while (curr != null) {
//            next = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = next;
//        }
//        return pre;

        // 使用堆栈解决
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty()) {
            return new ListNode();
        }
        ListNode newHead = stack.pop();
        ListNode current = newHead;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null;
        return newHead;
    }

    public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
