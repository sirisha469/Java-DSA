//https://leetcode.com/problems/reverse-linked-list-ii/description/
package LinkedList;

public class ReverseRangeLL {
  ListNode head;
  ListNode tail;
  class ListNode{
    int val;
    ListNode next;

    ListNode(){

    }
  }

  public ListNode reverseBetween(ListNode head, int left,int right){
    if(left==right){
      return head;
    }

    //skip the first left-1 nodes
    ListNode current = head;
    ListNode prev = null;

    for(int i=0;current!=null && i<left-1;i++){
      prev = current;
      current = current.next;
    }

    ListNode last = prev;
    ListNode newEnd = current;

    //reverse between left and right

    for(int i=0;current!=null && i<right-left+1;i++){
      ListNode nextNode = current.next;
      current.next = prev;
      prev = current;
      current = nextNode;
    }

    if(last!=null){
      last.next = prev;
    }
    else{
      head = prev;
    }

    newEnd.next = current;
    return head;

  }

  
}
