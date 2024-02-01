package Queue;

public class DynamicCircularQueue extends CircularQueue{

  DynamicCircularQueue(){
    super();
  }

  DynamicCircularQueue(int size){
    // data = new int[size];
    super(size);
  }

  //insert
  @Override
  public boolean insert(int item){
    if(isFull()){
      int[] temp = new int[data.length * 2];

      //It will iterate queue size
      for(int i=0;i<data.length;i++){
        temp[i] = (front + i) % data.length;
      }

      front = 0;
      end = data.length;

      data = temp;
    }

    return super.insert(item);
  }
}

class Main{
  public static void main(String[] args) throws Exception{
    CircularQueue dq = new DynamicCircularQueue(3);

    System.err.println(dq.insert(10));
    dq.insert(20);
    dq.insert(30);
    dq.insert(40);

    dq.display();
    System.out.println(dq.remove());
    dq.insert(40);
    dq.display();

  }
}