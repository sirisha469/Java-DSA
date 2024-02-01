// package Queue;

// public class CustomQueue {
  
//   private int[] data;
//   private final static int DEFAULT_SIZE = 10;

//   int end = 0;

//   CustomQueue(){
//     this(DEFAULT_SIZE);
//   }
//   CustomQueue(int size){
//     this.data = new int[size];
//   }

//   //Insert
//   public boolean insert(int item){
//     if(isFull()){
//       System.out.println("Queue is full");
//       return false;
//     }

//     data[end++] = item;
//     return true;
//   }

//   //remove
//   public int remove() throws Exception{
//     if(isEmpty()){
//       throw new Exception("Queue is empty");
//     }

//     int removed = data[0];
//     //shift the values to left
//     for(int i=1;i<end;i++){
//       data[i-1] = data[i];
//     }
//     end--;
//     return removed;
//   }

//   //first value
//   public int front(){
//     return data[0];
//   }

//   public boolean isFull(){
//     return end == data.length;
//   }

//   public boolean isEmpty(){
//     return end == 0;
//   }

//   public void display(){
//     for(int i=0;i<end;i++){
//       System.out.print(data[i]+" <- ");
//     }
//     System.out.println("END");
//   }
// }


// class Main{
//   public static void main(String[] args) throws Exception{
//     CustomQueue q = new CustomQueue(3);

//     q.insert(10);
//     q.insert(20);
//     q.insert(30);

//     System.out.println(q.remove());
//     System.out.println(q.front());
//     q.display();
//   }
// }