public class PowerOfFour {
  public static void main(String[] args) {
    int n1 = 16; // 16 is a power of 4 => 4^4
    System.out.println(isPowerOfFour(n1));
  }

  public static boolean isPowerOfFour(int n) {
    
    for(int i=0;i<=15;i++){
      //4^i 
      int power = (int) Math.pow(4,i);

      if(power == n){
          return true;
      }

      if(power > n){
          return false;
      }
    }
    return false;
}
}
