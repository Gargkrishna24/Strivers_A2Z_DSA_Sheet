package day5.linkedlist.reverselinkedList;


import java.util.List;

public class UsingBetterApproach {
    ListNode head;
    ListNode tail;
    int size;

    public ListNode reverseList(ListNode head){
        ListNode frontNode;
        ListNode previousNode=null;
        ListNode newNode = head;
        while(newNode!=null){
            frontNode = newNode.next;
            newNode.next = previousNode;
            previousNode = newNode;
            newNode=frontNode;

        }
        return previousNode;
    }

}
