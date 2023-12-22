package Interface;

class A{
  interface B{
    void put();
  }
}
public class InterfaceInsideClass implements A.B{
  @Override
  public void put() {
    System.out.println("put method");
  }
  public static void main(String[] args) {
    A.B a = new InterfaceInsideClass();
    a.put();
  }
}
