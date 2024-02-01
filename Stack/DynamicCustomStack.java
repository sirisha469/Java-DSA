package Stack;

public class DynamicCustomStack extends CustomStack{
  DynamicCustomStack(){
    super();
  }

  DynamicCustomStack(int size){
    super(size);
  }

  @Override
  public boolean push(int item){
    if(isFull()){
      //double the array size
      int[] temp = new int[data.length * 2];

      for(int i=0;i<data.length;i++){
        temp[i] = data[i];
      }
      
      // we can also add array data like below
      //System.arraycopy(data, 0, temp, 0,data.length);

      data = temp;
    }

    //if not full add item
    return super.push(item);
  }
}

class Main{
  public static void main(String[] args) throws StackException{
    CustomStack c = new DynamicCustomStack(4);

    c.push(10);
    c.push(20);
    c.push(30);
    // c.push(40);

    System.out.println(c.pop());
    System.out.println(c.pop());
  }
}
