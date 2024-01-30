//https://leetcode.com/problems/middle-of-the-linked-list/description/
package LinkedList;

public class MiddleOfLL {
  
  Node head;
  Node tail;
  private class Node{
    //int val;
    Node next;
  }

  public Node middleNode(Node head) {
    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}
