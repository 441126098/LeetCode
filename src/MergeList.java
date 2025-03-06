public class MergeList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*ListNode head;
        if (l1!=null&&l2!=null&&l1.val<l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        }
        else if (l1!=null&&l2!=null){
            head = new ListNode(l2.val);
            l2 = l2.next;
        }
        else if (l1!=null){
            head = new ListNode(l1.val);
            l1 = l1.next;
        }
        else if (l2!=null){
            head = new ListNode(l2.val);
            l2 = l2.next;
        }
        else{
            return null;
        }
        ListNode ans = head;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                ans.next = new ListNode(l1.val);
                ans = ans.next;
                l1 = l1.next;
            }
            else {
                ans.next = new ListNode(l2.val);
                ans = ans.next;
                l2 = l2.next;
            }
        }
        while (l1!=null){
            ans.next = new ListNode(l1.val);
            ans = ans.next;
            l1 = l1.next;
        }
        while (l2!=null){
            ans.next = new ListNode(l2.val);
            ans = ans.next;
            l2 = l2.next;
        }*/
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val < l2.val)
            return new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        else
            return new ListNode(l2.val, mergeTwoLists(l1, l2.next));
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode head1 = l1;
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(4);
        l1 = l1.next;
        ListNode l2 = new ListNode(1);
        ListNode head2 = l2;
        l2.next = new ListNode(3);
        l2 = l2.next;
        l2.next = new ListNode(4);
        l2 = l2.next;

        ListNode head = new MergeList().mergeTwoLists(head1, head2);
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }

    }
}