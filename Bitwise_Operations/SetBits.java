package Bitwise_Operations;

public class SetBits {
  public static void main(String[] args) {
    int n = 10;

    System.out.println(Integer.toBinaryString(n));

    System.out.println(setBits(n));

    setBit(n);

  }

  public static int setBits(int n){
    int count = 0;

    while(n>0){
      count++;
      n = n & (n-1);
    }

    return count;
  }

  public static void setBit(int n){
    int count = 0;

    while(n>0){
      if((n&1) == 1){
        count++;
      }

      n = n>>1;
    }
    System.out.println(count);
  }
}
