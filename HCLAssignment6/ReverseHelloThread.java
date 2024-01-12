package HCLAssignment6;

public class ReverseHelloThread implements Runnable{
  int threadNum;
  ReverseHelloThread(int threadNum){
    this.threadNum = threadNum;
  }

  public String reverse(String s){
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
  }

  @Override
  public void run(){
    System.out.println(reverse("Hello")+" from "+Thread.currentThread().getName()+"!");
    if(threadNum<=50){
      Thread rh = new Thread(new ReverseHelloThread(threadNum+1));
      rh.start();

      try {
        rh.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
    // System.out.println(reverse("Hello")+" from "+Thread.currentThread().getName()+"!");
  }
}

class ReverseHello{
  public static void main(String[] args) {
    ReverseHelloThread rh = new ReverseHelloThread(1);
    Thread t = new Thread(rh);
    t.start();
  }
}