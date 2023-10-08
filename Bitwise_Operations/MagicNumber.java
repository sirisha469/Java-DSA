package Bitwise_Operations;

public class MagicNumber {
  public static void main(String[] args) {
    int n = 6;
    magicNumber(n);
  }

  public static void magicNumber(int n){
    int ans = 0, base = 5;

    while(n > 0){
      int last = n & 1;
      n = n >> 1;
      ans = ans + (last * base);
      base = base * 5;
    }

    System.out.println(ans);
  }
}
