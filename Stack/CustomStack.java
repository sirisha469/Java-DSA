package Stack;

public class CustomStack {
  private int[] data;
  private static final int DEFAULT_SIZE = 10;

  int ptr = -1;

  CustomStack(){
    this(DEFAULT_SIZE);
  }

  CustomStack(int size){
    this.data = new int[size];
  }

  //push method
  public boolean push(int item){
    if(isFull()){
      System.out.println("Stack is full!");
      return false;
    }
    ptr++;
    data[ptr] = item;
    return true;
  }

  //remove item : pop method
  public int pop() throws Exception{
    if(isEmpty()){
      throw new Exception("Stack is empty");
    }

    int remove = data[ptr];
    ptr--;
    return remove;

    //return data[ptr--];
  }

  public int peek() throws Exception{
    if(isEmpty()){
      throw new Exception("Stack is empty");
    }
    return data[ptr];
  }

  //check stack is full
  public boolean isFull(){
    return ptr == data.length-1;
  }

  //check stack is empty
  public boolean isEmpty(){
    return ptr == -1;
  }
}

class Main{
  public static void main(String[] args) throws Exception {
    CustomStack c = new CustomStack();

    c.push(10);
    c.push(20);
    c.push(30);
    c.push(40);

    System.out.println(c.pop());

  }
}