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
    size++;
  }

  //delete first node
  public int deleteFirst(){
    int val = head.value;
    head = head.next;

    if(head==null){
      tail=null;
    }
    size--;
    return val;
  }

  //delete last value
  public int deleteLast(){

    if(size <= 1){
      return deleteFirst();
    }

    Node secondLast = get(size-2);
    int val = tail.value;
    tail = secondLast;
    tail.next = null;
    return val;
  }

  public int deleteAtIndex(int index){
    if(index==0){
      return deleteFirst();
    }

    if(index == size-1){
      return deleteLast();
    }

    Node prev = get(index-1);
    int val = prev.value;
    prev.next = prev.next.next;
    size--;
    return val;
  }

  //delete based on value
  public int deleteValue(int val){
    Node prev = find(val);
    int delValue = prev.value;
    prev.next = prev.next.next;
    size--;
    return delValue;
  }

  //delete value
  public Node find(int val){
    Node n = head;
    while(n!=null){
      if(n.value == val){
        return n;
      }
      n = n.next;
    }
    return null;
  }

  public Node get(int index){
    Node node = head;
    for(int i=0;i<index;i++){
      node = node.next;
    }
    return node;
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

    ll.insertFirst(12);
    ll.insertFirst(10);
    ll.insertFirst(8);
    ll.insertFirst(15);

    ll.insertLast(50);

    ll.insert(100, 3);
    ll.display();
    //delete
    System.out.println();
    System.out.println(ll.deleteFirst());
    ll.display();
    System.out.println();
    System.out.println(ll.deleteLast());
    ll.display();
  }
}