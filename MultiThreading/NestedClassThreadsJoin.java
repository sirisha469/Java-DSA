package MultiThreading;

public class NestedClassThreadsJoin {

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

    // walkThread.start();
    // chewThread.start();

    try{
      walkThread.start();
      // walking.join();
      walkThread.join(4000);
      chewThread.start();
    }
    catch(InterruptedException e){
      e.printStackTrace();
    }
    

  }
}
