package Bitwise_Operations;

public class OddNumber {
  public static void main(String[] args) {
    int n = 9;
    System.out.println(isOdd(n));
  }

  public static boolean isOdd(int n){
    return (n & 1) == 1;
  }
}
