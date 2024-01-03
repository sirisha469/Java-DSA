package NestedClasses;

abstract class Shape{
  abstract void area();
}
//anonymus class automatically extends the shape class
public class AnonymusClass {
  public static void main(String[] args) {
    //object creation for abstract class is not possible -- but anonymus class do
    Shape s = new Shape() {
      void area(){
        System.out.println("Inside anonymus class");
      }
    }; //anonymus inner class //sub-class //creating object
    s.area();
  }
}
