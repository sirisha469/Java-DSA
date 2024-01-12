package HCLAssignment6;

public class NumberDivisible implements Runnable{
  @Override
  public void run(){
    for(int i=1;i<=100;i++){
      if(i%10==0){
        System.out.println(Thread.currentThread().getName()+", Number "+i);
      }
      sleep();
    }
  }

  public static void sleep(){
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    NumberDivisible nd = new NumberDivisible();
    Thread t = new Thread(nd,"Thread");
    t.start();
  }
}
