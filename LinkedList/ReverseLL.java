package LinkedList;

public class ReverseLL {
  Node head;
  Node tail;
  class Node{
    int val;
    Node next;

    Node(){

    } 
  }

  public Node reverse(Node head){
    Node prev = null;
    Node curr = head;
    Node nextNode = curr.next;

    while(curr!=null){
      curr.next = prev;
      prev = curr;
      curr = nextNode;
      if(nextNode!=null){
        nextNode = nextNode.next;
      }
    }

    return prev;
  }
}
