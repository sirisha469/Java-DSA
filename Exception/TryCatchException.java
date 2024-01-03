package Exception;

public class TryCatchException {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;
    String s = "abc";//null
    String str = "hi";

    try{
      int ans = a/b;
      System.out.println(ans);
      System.out.println(s.length());
      System.out.println(Integer.parseInt(str));
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    catch(NullPointerException e){
      System.out.println(e);
    }
    catch(NumberFormatException e){
      System.out.println(e);
    }
    catch(Exception e){//if the exception is not present in above catch block it comes to default exception block
      System.out.println(e);
    }
  }
}
