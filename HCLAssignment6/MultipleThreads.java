package HCLAssignmentThreads;

public class MultipleThreads implements Runnable{
  int n;
  MultipleThreads(int n){
    this.n = n;
  }
  public void run(){
    for(int i=1;i<=10;i++){
      System.out.println(Thread.currentThread().getName()+": "+i+" * "+n+" = "+n*i);
    }
  }
  public static void main(String[] args) {
    MultipleThreads mt1 = new MultipleThreads(2);
    Thread t1 = new Thread(mt1);
    MultipleThreads mt2 = new MultipleThreads(3);
    Thread t2 = new Thread(mt2);
    MultipleThreads mt3 = new MultipleThreads(4);
    Thread t3 = new Thread(mt3);
    t1.start();
    t2.start();
    t3.start();
  }
}
