package MultiThreading;
public class SequentialThreads implements Runnable{

  @Override
  public void run(){
    for(int i=1;i<5;i++){
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      String threadName = Thread.currentThread().getName();
      System.out.println(threadName+" says: "+i);
    }
  }
  public static void main(String[] args) {
    Thread firstThread = new Thread(new ConcurrentThreads());

    Thread secondThread = new Thread(new ConcurrentThreads());

    firstThread.run();
    secondThread.run();
  }
}