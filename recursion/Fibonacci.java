package Recursion;

public class Fibonacci {
  public static void main(String[] args) {
    //int ans = fibonacci(4);
    //System.out.println(ans); 

    for(int i=1;i<11;i++){
      System.out.println(i+"-->"+fiboFormula(i));
    }

    System.out.println(fiboFormula(50));

  }

  public static int fiboFormula(int n){
    double left = Math.pow((1+Math.sqrt(5))/2,n);
    //double right = Math.pow((1-Math.sqrt(5))/2,n);
    //less dominating term removed

    return (int) (left/Math.sqrt(5));
  }

  static int fibonacci(int n){
    if(n < 2){
      return n;
    }

    return fibonacci(n-1) + fibonacci(n-2);
  } 
}
