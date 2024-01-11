package MultiThreading;

class Q{
  int n;
  boolean valueset =  false;
  synchronized int get(){
    if(!valueset){
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("got: "+n);
    valueset = false;
    notify();
    return n;
  }

  synchronized void put(int n) {
    if(valueset){
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    this.n = n;
    System.out.println("put: "+n);
    valueset = true;
    notify();//It will notify the other thread to do your work
  }
}

class Producer implements Runnable{
  Q q;
  Thread t;
  Producer(Q q){
    this.q = q;
    t = new Thread(this, "Producer");
    t.start();
  }

  public void run(){
    for(int i=1;i<=20;i++){
      q.put(i);
    }
  }
}

class Consumer implements Runnable{
  Q q;
  Thread t;
  Consumer(Q q){
    this.q = q;
    t = new Thread(this, "Producer");
    t.start();
  }

  public void run(){
    for(int i=1;i<=20;i++){
      q.get();
    }
  }
}
public class ProducerConsumerProblem {
  public static void main(String[] args) {
    Q q = new Q();
    new Producer(q);
    new Consumer(q);
  }
}

