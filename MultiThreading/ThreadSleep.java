package MultiThreading;

public class ThreadSleep implements Runnable{

  @Override
  public void run() {
    for(int i=1;i<5;i++){
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("i: "+i);
    }
  }

  public static void main(String[] args) {
    Thread myThread = new Thread(new ThreadSleep());

    myThread.start();
  }
  
}
