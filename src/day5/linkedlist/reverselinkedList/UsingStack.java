package day5.linkedlist.reverselinkedList;

import java.util.Stack;
public class UsingStack {

    ListNode head;
    ListNode tail;
    int size;

    public ListNode reverseList(ListNode head) {
        Stack<Integer> st= new Stack<>();
        ListNode newNode = head;
        while(newNode!=null){
            st.push(newNode.data);
            newNode=newNode.next;
        }
        newNode=head;
        while(newNode!=null){
            newNode.data=st.peek();
            st.pop();
            newNode=newNode.next;
        }
        return head;
    }

}
