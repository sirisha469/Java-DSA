package NestedClasses;

//for non-static
class A{
  int n1=10;
  static int n2=20;
  class B{
    void show(){
      System.out.println("Instance variable: "+n1);
      System.out.println("class variable: "+n2);
    }
  }
}

//for static
class C{
  int n1=10;//non-static members are not accessble inside static class
  static int n2=20;
  static class D{
    void show(){
      //A outer class object
      C a = new C();
      System.out.println("Instance variable: "+a.n1);
      System.out.println("class variable: "+n2);
    }
  }
}
public class StaticNestedClass {
  public static void main(String[] args) {
    A a1 = new A();
    System.out.println(a1.n1);
    //System.out.println(a1.n2);

    //Inner class object creation - non static inner class
    A.B oi = new A().new B();
    oi.show();

    //static inner class
    C.D ab = new C.D();
    ab.show();
  }
}
