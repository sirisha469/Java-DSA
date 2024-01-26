package LinkedList;

public class CustomLL {
  
  private Node head;
  private Node tail;
  private int size;

  public CustomLL(){
    this.size=0;
  }

  //Inserting node at first
  public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    head = node;

    if(tail==null){
      tail=head;
    }

    size += 1;
  }

  //Insert at last
  public void insertLast(int val){
    if(tail==null){
      insertFirst(val);
      return;
    }

    Node node =new Node(val);
    tail.next = node;
    tail=node;
    size++;
  }

  //Insert at specified position
  public void insert(int val, int index){
    if(index==0){
      insertFirst(val);
      return;
    }
    if(index==size){
      insertLast(val);
      return;
    }

    Node temp = head;
    
    for(int i=1;i<index;i++){
      temp = temp.next;
    }

    Node node = new Node(val, temp.next);
    temp.next = node;
  }

  //delete first node
  public int deleteFirst(){
    int val = head.value;
    head = head.next;

    if(head==null){
      tail=null;
    }
    return val;
  }

  //display the node values
  public void display(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.value +" -> ");
      temp = temp.next;
    }
    System.out.print("END");
  }

  private class Node{
    private int value;
    private Node next;

    public Node(int value){
      this.value = value;
    }

    public Node(int value,Node next){
      this.value = value;
      this.next = next;
    }
  }

}


class Main{
  public static void main(String[] args) {
    CustomLL ll = new CustomLL();

    ll.insertFirst(10);
    ll.insertFirst(8);
    ll.insertFirst(15);

    ll.insertLast(50);

    ll.insert(100, 3);
    ll.display();
    //delete
    System.out.println(ll.deleteFirst());
    ll.display();
  }
}