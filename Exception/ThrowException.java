package Exception;

public class ThrowException {
  static void exception(){
    int age = 10;
    try{
      if(age<18){
        throw new Exception("Not eligible");
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
  public static void main(String[] args) {
    exception();
  }
}
