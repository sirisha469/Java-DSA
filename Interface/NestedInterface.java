package Interface;

/**
 * InnerNestedInterface
 */
interface A {
  void get();
  interface B{
    void put();
  }
}
public class NestedInterface implements A {
  public void get(){
    System.out.println("Get");
  }

  public static void main(String[] args) {
    A n = new NestedInterface();
    n.get();
  }

}

class NestedInterface2 implements A.B{
  
  // public void get(){
  //   System.out.println("Get");
  // }

  public void put(){
    System.out.println("Put");
  }

  public static void main(String[] args) {
    A.B a= new NestedInterface2();
    // a.get(); - error
    a.put();
  }
}