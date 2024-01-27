package LinkedList;

class DoublyLL {
  
  private Node head;

  //Insert node at first
  public void insertFirst(int val){
    Node node = new Node(val);

    node.next = head;
    node.prev = null;
    if(head!=null){
      head.prev = node;
    }
    
    head = node;
  }

  //Insert at specified position
  public void insert(int val,int index){
    Node node = new Node(val);
    Node p = get(index);

    node.next = p.next;
    node.prev = p;
    p.next = node;
    node.next.prev = node;
  }

  //Insert at last
  public void insertLast(int val){
    Node node = new Node(val);
    Node last = head;

    node.next = null;
    while(last.next!=null){
      last = last.next;
    }
    node.prev = last;
    last.next = node;
  }

  public Node get(int index){
    Node temp = head;
    for(int i=0;i<index;i++){
      temp = temp.next;
    }
    return temp;
  }

  //display doubly linked list
  public void display(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.val+" -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }

  //dispaly in reverse 
  public void displayRev(){
    Node node = head;
    Node last = null;

    while(node!=null){
      last = node;
      node = node.next;
    }

    while(last!=null){
      System.out.print(last.val+" -> ");
      last = last.prev;
    }
    System.out.println("START");
  }

  class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val){
      this.val = val;
    }

    public Node(int val,Node next){
      this.val = val;
      this.next = next;
    }

    public Node(int val,Node next, Node prev){
      this.val = val;
      this.next = next;
      this.prev = prev;
    }
  }

}

class Main{
  public static void main(String[] args) {
    DoublyLL dll = new DoublyLL();

    dll.insertFirst(30);
    dll.insertFirst(18);
    dll.insertFirst(25);
    dll.insertFirst(8);

    dll.insertLast(99);
    dll.display();

    dll.insert(200,2);

    System.out.println("print reverse order:");
    dll.displayRev();
  }
}