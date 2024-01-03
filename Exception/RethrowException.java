package Exception;

public class RethrowException {

  static void exception(){
    int a = 10;
    int b = 0;

    try{
      int ans = a/b;
      System.out.println(ans);
    }
    catch(Exception e){
      throw e;
    }
  }
  public static void main(String[] args) {
    try{
      exception();
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    System.out.println("End of main");
  }
}
