package day5.linkedlist.middlenode;

import java.util.List;

public class UsingTwoPointer {
    ListNode head;

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
         slow = slow.next;
         fast = fast.next.next;
        }
        return slow;
    }
}
