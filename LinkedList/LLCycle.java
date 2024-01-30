//https://leetcode.com/problems/linked-list-cycle/description/
package LinkedList;

public class LLCycle {
  Node head;
  Node tail;
  private class Node{
    //int val;
    Node next;
  }

  public boolean hasCycle(Node head) {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next !=null){
      fast = fast.next.next;
      slow = slow.next;

      if(fast == slow){
        return true;
      }
    }

    return false;
  }

  //https://leetcode.com/problems/linked-list-cycle-ii/description/
  //length of the cycle
  public int hasCycleLength(Node head) {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next !=null){
      fast = fast.next.next;
      slow = slow.next;

      if(fast == slow){
        Node temp = slow;
        int length = 0;

        do{
          temp = temp.next;
          length++;
        }while(temp != slow);

        return length;
      }
    }

    return 0;
  }

  public Node detectCycle(Node head){
    int length = 0;

    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next !=null){
      fast = fast.next.next;
      slow = slow.next;

      if(fast == slow){
        length = hasCycleLength(slow);
        break;
      }
    }

    if(length == 0){
      return null;
    }
    //find the start node
    Node f = head;
    Node s = head;
    while(length>0){
      s = s.next;
      length--;
    }

    //keep moving both forward and they will meet at cycle start
    while(f != s){
      f = f.next;
      s = s.next;
    }
    
    return s;
  }
}
