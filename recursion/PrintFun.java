package Recursion;

public class PrintFun {
  public static void main(String[] args) {
    // fun1(5);
    // fun2(5);
    funBoth(5);
  }

  public static void fun1(int n){
    if(n==0)
      return;
    
    System.out.print(n+" ");
    fun1(n-1);
  }

  //printing from last to first
  public static void fun2(int n){
    if(n==0)
      return;
    
    fun2(n-1);
    //after all the successful function call it starts printing
    System.out.print(n+" ");
  }

  public static void funBoth(int n){
    if(n==0)
      return;
    
    System.out.print(n+" ");
    funBoth(n-1); 
    //after all the successful function call it starts printing
    System.out.print(n+" ");
  }
}
