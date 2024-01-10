package MultiThreading;

public class RunnableInterface implements Runnable{

  @Override
  public void run(){
    System.out.println("Runnable Interfece run() method");
  }

  public static void main(String[] args) {
    RunnableInterface ri = new RunnableInterface();

    Thread myThread = new Thread(ri);
    myThread.start();
    // myThread.run();
    // ri.run(); //It is also possible

    System.out.println("Is myThread is Runnable? "+(myThread instanceof Runnable));

    System.out.println("Is myThread is Thread? "+(myThread instanceof Thread));

    System.out.println("Is myThread is Object? "+(myThread instanceof Object));

    Runnable r = new RunnableInterface();
    r.run();
  }
}
