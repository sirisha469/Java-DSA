package Recursion;

public class ReverseNumber {
  public static void main(String[] args) {
    reverse1(1234);
    System.out.println(sum);

    System.out.println(rev(1234));
  }

  //way1 
  static int sum=0;
  public static void reverse1(int n){
    if(n==0)
      return;
    
    sum = sum * 10 + (n%10);

    reverse1(n/10);
  }

  //way2

  public static int rev(int n){
    int digits = (int)(Math.log10(n)+1);

    return helper(n, digits);
  }

  public static int helper(int n,int digits){
    if(n%10 == n){
      return n;
    }

    int rem = n%10;

    return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
  }
  
}
