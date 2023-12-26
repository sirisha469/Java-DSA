package NestedClasses;


class Outer{
  int i=23;
  static int j = 30;
  void get(){
    System.out.println("i: "+i);
  }

  public static void go(){
    System.out.println("j: "+j);
  }

  void display(){
    //int value = 43;
    class LocalClass{
      int i = 100;
      void show(){
        System.out.println("value: "+i);
        System.out.println("i: "+Outer.this.i);
        System.out.println("j: "+j);
      }
    }
    LocalClass l = new LocalClass();
    l.show();
  }
}
public class LocalInnerClass {
  public static void main(String[] args) {
    Outer o = new Outer();
    o.display();
  }
}
