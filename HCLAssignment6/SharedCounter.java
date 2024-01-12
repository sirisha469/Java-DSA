package HCLAssignment6;

public class SharedCounter {
  public static int counter=0;

  class IncrementThread implements Runnable{
    @Override
    public void run(){
      for(int i=1;i<=10;i++){
        Thread.yield(); 
        counter++;
      }
    }
  }
  public static void main(String[] args) {
    for(int i=1;i<=10;i++){
      IncrementThread it = new SharedCounter().new IncrementThread();
      Thread t = new Thread(it);
      t.start();
    }
    System.out.println(counter);
  }
}
