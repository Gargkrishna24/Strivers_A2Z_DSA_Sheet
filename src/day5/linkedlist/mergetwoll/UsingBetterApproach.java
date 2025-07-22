package day5.linkedlist.mergetwoll;

public class UsingBetterApproach {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val < temp2.val){
                current.next=temp1;
                temp1=temp1.next;
            }else {
                current.next = temp2;
                temp2=temp2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = temp1;
        } else {
            current.next = temp2;
        }
        return dummy.next;
    }
}
