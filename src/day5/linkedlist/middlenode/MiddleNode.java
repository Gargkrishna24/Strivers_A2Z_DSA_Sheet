package day5.linkedlist.middlenode;

import java.util.List;

public class MiddleNode {
    ListNode head ;
    public ListNode middleNode(ListNode head){
        ListNode temp = head;
        int size = 0;
        int n ;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int mid = size/2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp=temp.next;
        }
        return temp;
    }
}
