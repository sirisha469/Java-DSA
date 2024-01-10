package MultiThreading;

public class ThreadPriorities {
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

    walkThread.start();
    chewThread.start();

    System.out.println("\nwalkThread's Id: "+walkThread.getId());
    System.out.println("chewThread's Id: "+chewThread.getId());
    System.out.println("main thread's Id: "+Thread.currentThread().getId());

    System.out.println("\nwalkThread's Name: "+walkThread.getName());
    System.out.println("chewThread's Name: "+chewThread.getName());
    System.out.println("main thread's Name: "+Thread.currentThread().getName());

    System.out.println("\nwalkThread's thread group: "+walkThread.getThreadGroup());
    System.out.println("chewThread's thread group: "+chewThread.getThreadGroup());
    System.out.println("main Thread's thread group: "+Thread.currentThread().getThreadGroup());

    System.out.println("\nwalkThread's priority: "+walkThread.getPriority());
    System.out.println("chewThread's Priority: "+chewThread.getPriority());
    System.out.println("main Thread's priority: "+Thread.currentThread().getPriority());

    System.out.println("Active threads: "+Thread.activeCount());
    System.out.println("\n\n");

    //we can also set priporities
    // walkThread.setPriority(9);
    // chewThread.setPriority(2);

    //  System.out.println("\nwalkThread's priority: "+walkThread.getPriority());
    // System.out.println("chewThread's Priority: "+chewThread.getPriority());
    // System.out.println("main Thread's priority: "+Thread.currentThread().getPriority());
    // walkThread.start();
    // chewThread.start();

    // System.out.println("\n\n");

  }
}
