package MultiThreading;

public class Thread_isAlive {
  public static class walk implements Runnable{
    @Override
    public void run(){
      for(int i=1;i<5;i++){
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("I am walking... is thread isAlive: "+Thread.currentThread().isAlive());
      }
    }
  }
  public static void main(String[] args) {
    Thread walkThread = new Thread(new walk());
    System.out.println("isAlive state of walkThread after init: "+walkThread.isAlive());

    try{
      walkThread.start();
      System.out.println("isAlive state of walkThread after start: "+walkThread.isAlive());

      walkThread.join(5000);
      System.out.println("isAlive state of walkThread after join: "+walkThread.isAlive());

      Thread.sleep(10000);
      System.out.println("Alive state of walkThread at the end: "+walkThread.isAlive());
    }
    catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}
