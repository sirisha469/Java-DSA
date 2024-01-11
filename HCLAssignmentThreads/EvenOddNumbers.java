package HCLAssignmentThreads;

class Even implements Runnable{
  @Override
  public void run(){
    for(int i=1;i<10;i++){
      if(i%2==0){
        System.out.println(Thread.currentThread().getName()+": Even Number ="+i);
      }
    }
  }
}

class Odd implements Runnable{
  @Override
  public void run(){
    for(int i=1;i<10;i++){
      if(i%2!=0){
        System.out.println(Thread.currentThread().getName()+": Even Number ="+i);
      }
    }
  }
}
public class EvenOddNumbers{

  public static void main(String[] args) {
    Even e = new Even();
    Thread evenThread = new Thread(e,"Even Thread");
    Odd o = new Odd();
    Thread oddThread = new Thread(o,"Odd Thread");

    evenThread.start();
    oddThread.start();
  }
}
