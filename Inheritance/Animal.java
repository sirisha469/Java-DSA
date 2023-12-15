package Inheritance;
class Bird extends Animal{
  Bird(){
    // super(10);
    System.out.println("Bird class constructor");
  }
  // static {
  //   System.out.println("static Bird");
  // }
  // {
  //   System.out.println("Block Bird");
  // }
  void walk(){
    super.walk();
    System.out.println("Bird walking");
  }
 
}
class Animal {
  Animal(){
    System.out.println("Animal class constructor");
  }
  
  // static {
  //   System.out.println("static Animal");
  // }

  // {
  //   System.out.println("block animal");
  // }
  void walk(){
    System.out.println("Animal walking");
  }
}



class Main{
  public static void main(String[] args){
    Bird b = new Bird();
    // Animal a = new Animal();
    // a.walk();
    //b.walk();
  }
}
