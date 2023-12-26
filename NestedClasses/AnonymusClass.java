package NestedClasses;

abstract class Shape{
  abstract void area();
}
public class AnonymusClass {
  public static void main(String[] args) {
    //object creation for abstract class is not possible -- but anonymus class do
    Shape s = new Shape() {
      void area(){
        System.out.println("Inside anonymus class");
      }
    };
    s.area();
  }
}
