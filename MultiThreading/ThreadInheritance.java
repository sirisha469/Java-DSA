package MultiThreading;

public class ThreadInheritance extends Thread{

  @Override
  public void run(){
    System.out.println("Extend Thread class: run() method");
  }
  public static void main(String[] args) {
    
    ThreadInheritance myThread = new ThreadInheritance();
    myThread.start();
    
    System.out.println("Is myThread is Runnable? "+(myThread instanceof Runnable));

    System.out.println("Is myThread is Thread? "+(myThread instanceof Thread));

    System.out.println("Is myThread is Object? "+(myThread instanceof Object));
  }
}
