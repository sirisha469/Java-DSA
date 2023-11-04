package MathDSA;

public class LCM_GCD {
  public static void main(String[] args) {
    System.out.println(gcd(4, 8));
    System.out.println(gcd(4, 9));

    System.out.println(lcm(2,7));
  }

  public static int gcd(int a, int b){
    if(a==0)
      return b;
    
    return gcd( b%a, a);
  }

  //It use gcd
  //the answer that is divisible by a and b
  public static int lcm(int a, int b){
    return a*b / gcd(a,b);
  }
}
