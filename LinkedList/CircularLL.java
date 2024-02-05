package LinkedList;

public class CircularLL {

  Node head;

  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
    }
  }
  public Node sortedInsert(Node head, int data) {
    // code here
   Node newNode = new Node(data);
    
    if (head == null) {
        newNode.next = newNode;
        return newNode;
    }
    
    Node curr = head;
    Node nextNode = curr.next;
    
    // Case 1: Insert at the beginning
    if (data <= curr.data) {
        newNode.next = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        return newNode;
    }
    
    // Case 2: Insert in the middle or at the end
    while (nextNode != head && data > nextNode.data) {
        curr = nextNode;
        nextNode = nextNode.next;
    }
    
    curr.next = newNode;
    newNode.next = nextNode;
    
    return head;

    
}
}
