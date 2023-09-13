// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

package patterns;

public class pattern2 {
  public static void main(String[] args) {
    pattern(5);
  }

  static void pattern(int n){
    for(int i=0;i<n; i++){
      for(int j=0;j<n; j++){
        if(i-j >=0 && i+j <= n-1)
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
