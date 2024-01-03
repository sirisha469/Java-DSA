package Exception;

public class ThrowsException {
  public static void main(String[] args) throws Exception {
    int age = 10;
    if(age<20){
      throw new Exception();
    }
  }
}
