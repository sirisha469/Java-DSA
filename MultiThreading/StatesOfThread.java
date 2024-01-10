package MultiThreading;

public class StatesOfThread {
  public static class walk implements Runnable{
    @Override
    public void run(){
      for(int i=1;i<5;i++){
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("I am walking..."+Thread.currentThread().getState());
      }
    }
  }
  public static void main(String[] args) {
    Thread walkThread = new Thread(new walk());
    System.out.println("State of walkThread after init: "+walkThread.getState());
    System.out.println("State of main thread after init: "+Thread.currentThread().getState());

    try{
      walkThread.start();
      System.out.println("State of walkThread after start: "+walkThread.getState());
      System.out.println("State of main thread after start: "+Thread.currentThread().getState());

      Thread.sleep(1000);
      walkThread.join(5000);

      System.out.println("State of walkThread after join: "+walkThread.getState());
      System.out.println("State of main thread after walkThread join: "+Thread.currentThread().getState());

      System.out.println("Main thread will sleep for 20s...");
      Thread.sleep(20000);
      System.out.println("State of walkThread at the wnd: "+walkThread.getState());
      System.out.println("State of main thread at the end: "+Thread.currentThread().getState());
    }
    catch(InterruptedException e){
      e.printStackTrace();
    }

  }
}
