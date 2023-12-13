package Inheritance;

class Animal {
  
  static {
    System.out.println("static Animal");
  }

  {
    System.out.println("block animal");
  }
}

class Bird extends Animal{
  static {
    System.out.println("static Bird");
  }
  {
    System.out.println("Block Bird");
  }

  void walk(){
    System.out.println("Bird walking");
  }
 
}

class Main{
  public static void main(String[] args){
    Bird b = new Bird();
    b.walk();
  }
}
