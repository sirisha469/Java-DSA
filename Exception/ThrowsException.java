package Exception;

public class ThrowsException {
  public static void main(String[] args) throws NullPointerException {
    String str = null;
    
    if(str==null){
      throw new NullPointerException();
    }
    
  }
}
