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

public class pattern3 {
  public static void main(String[] args) {
    pattern(5);
  }

  static void pattern(int n){
    for(int i=0;i<2*n-1; i++){
      int index = i-n+1;
      int pos = i>=n ? n-index-1: i;
      // if(i >= n){
      //   int index = i-n+1;
      //   for(int j=0;j<n-index-1;j++){
      //     System.out.print("* ");
      //   }
      // }
      // else{
      //   for(int j=0;j<=i;j++){
      //     System.out.print("* ");
      //   }
      // }

      for(int j=0;j<=pos;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
