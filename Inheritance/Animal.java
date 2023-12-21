package Inheritance;

class Animal {
  Animal(){
    System.out.println("Animal class constructor");
  }
  
  static {
    System.out.println("static Animal");
  }

  {
    System.out.println("block animal");
  }
  void walk(){
    System.out.println("Animal walking");
  }
}

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
    // super.walk();
    System.out.println("Bird walking");
  }

  void downCasting(){
    System.out.println("Bird down casting");
  }
 
}

class Main{
  public static void main(String[] args){
    {
      System.out.println("Hi");
    }
    // Animal b = new Bird();
    // Animal a = new Animal();
    // a.walk();
    // b.walk();
    // Bird b1 = (Bird)b;
    // b1.downCasting();
    Main m = new Main();
    
  }
  static{
    System.out.println("Hello");
    {
      System.out.println("siri");
    }
  }

  {
    System.out.println("naga");
  }
}
