package MultiThreading;

class A{
  
  synchronized void foo(B b){
    System.out.println(Thread.currentThread().getName()+" enterd A.foo()");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      
    }
    System.out.println(Thread.currentThread().getName()+" trying to call B.last()");

    b.last();
  }
  synchronized void last(){
    System.out.println("Inside A.last()");
  }
}

class B{
  synchronized void bar(A a){
    System.out.println(Thread.currentThread().getName()+" enterd A.foo()");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      
    }
    System.out.println(Thread.currentThread().getName()+" trying to call B.last()");

    a.last();
  }
  synchronized void last(){
    System.out.println("Inside B.last()");
  }
}
public class DeadLock implements Runnable{

  A a = new A();
  B b = new B();
  DeadLock(){
    Thread.currentThread().setName("Main Thread");
    Thread t = new Thread();
    t.start();
    a.foo(b);
    System.out.println("Main thread completed its task");
  }

  public void run(){
    b.bar(a);
    System.out.println("child completed its task");
  }

  public static void main(String[] args) {
    new DeadLock();
  }
}
