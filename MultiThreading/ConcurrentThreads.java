package MultiThreading;

public class ConcurrentThreads implements Runnable{

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
    // Thread firstThread = new Thread(new ConcurrentThreads());

    // Thread secondThread = new Thread(new ConcurrentThreads());
    // //both threads are executing concurrently
    // firstThread.start();
    // secondThread.start();

    //it is already in thread invocation is not possible it shoes error
    //firstThread.start();


    //Here we can also specify the name to the threads
    Thread firstThread = new Thread(new ConcurrentThreads(), "1st Thread");

    Thread secondThread = new Thread(new ConcurrentThreads());

    secondThread.setName("2nd Thread");

    firstThread.start();
    secondThread.start();

  }
}
