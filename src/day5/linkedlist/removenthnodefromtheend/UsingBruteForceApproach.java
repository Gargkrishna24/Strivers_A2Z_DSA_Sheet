package day5.linkedlist.removenthnodefromtheend;

public class UsingBruteForceApproach {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        for (int i = 0; i < size-n; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }
}
