package MultiThreading;

public class DeamonThread {

  public static class walk implements Runnable{
    @Override
    public void run(){
      for(int i=1;i<5;i++){
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("I am walking...");
      }
    }
  }

  public static class Chew implements Runnable{
    @Override
    public void run(){
      for(int i=1;i<5;i++){
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("I am chewing gum...");
      }
    }
  }
  public static void main(String[] args) {
    Thread walkThread = new Thread(new walk());
    Thread chewThread = new Thread(new Chew());

    chewThread.setDaemon(true);

    System.out.println("walkThread's deamon status: "+walkThread.isDaemon());
    System.out.println("chewThread's deamon status: "+chewThread.isDaemon());
    System.out.println("main thread's deamon status: "+Thread.currentThread().isDaemon());

    walkThread.start();
    chewThread.start();

    System.out.println("\n");
  }
}
