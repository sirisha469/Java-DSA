//pattern1
// *
// **
// ***
// ****
// *****


//pattern2
// *****
// ****
// ***
// **
// *


package patterns;

public class pattern7 {
  public static void main(String[] args) {
    pattern1(5);
    pattern2(5);
  }

  // pattern1
  static void pattern1(int n){

    for(int i=0;i<n;i++){
      for(int j=0; j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // pattern2
  static void pattern2(int n){

    for(int i=n;i>0;i--){
      for(int j=0; j<i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
