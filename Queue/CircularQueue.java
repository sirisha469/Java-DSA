package Queue;

public class CircularQueue {
  protected int[] data;
  private static final int DEFAULT_SIZE = 10;

  int front = 0;
  int end = 0;
  private int size;

  CircularQueue(){
    this(DEFAULT_SIZE);
  }

  CircularQueue(int size){
    data = new int[size];
  }

  //insert
  public boolean insert(int item){
    if(isFull()){
      System.out.println("Queue is full");
      return false;
    }

    data[end++] = item;
    end = end % data.length;
    size++;
    return true;
  }

  //remove
  public int remove() throws Exception{ 
    if(isEmpty()){
      throw new Exception("Queue is empty");
    }
    
    int removed = data[front++];
    front = front % data.length;
    size--;
    return removed;
  }

  public boolean isFull(){
    return size == data.length;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public int front(){
    return data[front];
  }

  public void display(){
    int i=front;
    do{
      System.out.print(data[i]+ " <- ");
      i++;
      i = i % data.length;
    }while(i!=end);
    System.out.println("END");
  }
}

class Main{
  public static void main(String[] args) throws Exception{
    CircularQueue q = new CircularQueue(3);

    q.insert(10);
    q.insert(20);
    q.insert(30);
    // q.insert(40);

    q.display();
    System.out.println(q.remove());
    q.insert(40);
    q.display();

  }
}