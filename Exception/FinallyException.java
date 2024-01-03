package Exception;

public class FinallyException {
  public static void main(String[] args) {
    //finally block will definitely exceute if any thing wrong in the code also
      int a = 10;
      int b = 10;
      String str = "abc";
      try{
        int ans = a/b;
        System.out.println(ans);
        try{
          System.out.println(str.length());
        }
        catch(NullPointerException e){
          System.out.println(e);
        }
        finally{
          System.out.println("Inner finally block");
        }
      }
      catch(Exception e){//if the exception is not present in above catch block it comes to default exception block
        System.out.println(e);
      }
      finally{
        System.out.println("main block end");
      }
      
    }
}
