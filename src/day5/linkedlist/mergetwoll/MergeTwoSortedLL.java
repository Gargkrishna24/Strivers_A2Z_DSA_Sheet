package day5.linkedlist.mergetwoll;

import java.util.ArrayList;

import java.util.Collections;


public class MergeTwoSortedLL {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> array = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
       while(temp1!=null){
           array.add(temp1.val);
           temp1=temp1.next;
       }
       while(temp2!=null){
           array.add(temp2.val);
           temp2=temp2.next;
       }
       Collections.sort(array);
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int val : array) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }
}
