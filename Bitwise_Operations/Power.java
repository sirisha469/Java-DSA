package Bitwise_Operations;

public class Power {
  public static void main(String[] args) {
    
    int base = 3, power = 6;
    int ans = 1;
    System.out.print(base+"^"+power+"=");
    while(power > 0){
      if((power & 1) == 1){
        ans = ans * base;
      }
      base = base * base;
      power = power >> 1;
    }
    System.out.println(ans);
  }
}
