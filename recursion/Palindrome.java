package Recursion;

public class Palindrome {
  public static void main(String[] args) {
    // System.out.println(reverse(12321));
    System.out.println(palindrome(12321));
  }

  public static int reverse(int n){
    int digits = (int) Math.log10(n)+1;
    return helper(n,digits);
  }

  public static int helper(int n,int digits){
    if(n%10 == n){
      return n;
    }

    int rem = n%10;
    return rem * (int) Math.pow(10,digits-1) + helper(n/10, digits-1);
  }

  public static boolean palindrome(int n){
    return n == reverse(n);
  }

}
