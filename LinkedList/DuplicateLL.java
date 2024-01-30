//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

package LinkedList;
public class DuplicateLL {

  Node head;
  Node tail;
  private class Node{
    int val;
    Node next;
  }

  public Node deleteDuplicates(Node head) {
    if(head == null){
        return head;
    }

    Node node = head;

    while(node.next!=null){
      if(node.val == node.next.val){
        node.next = node.next.next;
      }
      else{
        node = node.next;
      }
    }
    return head;
  }
}
