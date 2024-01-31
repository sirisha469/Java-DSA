package LinkedList;

public class BubbleSortLL {
  Node head;
  Node tail;
  class Node{
    int val;
    Node next;

    Node(){

    }
  }
  public void bubbleSort(){
    bubbleSort(4,0);
  }

  private void bubbleSort(int row,int col){
    if(row == 0){
      return;
    }

    if(col < row){
      Node first = get(col);
      Node second = get(col+1);

      if(first.val > second.val){
        if(first == head){
          head = second;
          first.next = second.next;
          second.next = first;
        }
        else if(second == tail){
          Node prev = get(col-1);
          prev.next = second;
          tail = first;
          first.next = null;
          second.next = tail;
        }
        else{
          Node prev = get(col-1);
          prev.next = second;
          first.next = second.next;
          second.next = first;
        }
      }
      bubbleSort(row,col+1);
    }
    else{
      bubbleSort(row-1,0);
    }
  }

  public Node get(int index){
    Node temp = head;
    for(int i=0;i<index;i++){
      temp = temp.next;
    }
    return temp;
  }

}
