
  //      *
  //     * *
  //    * * *
  //   * * * *
  //  * * * * *
  //   * * * *
  //    * * *
  //     * *
  //      *


package patterns;

public class pattern4 {

  public static void main(String[] args) {
    
  }

  static void pattern(int n){
    for(int i=0;i<2*n-1; i++){
      int index = i-n+1;
      int pos = i>=n ? n-index-1: i;

      int noOfSpaces = n-pos;

      for(int s=0; s< noOfSpaces;s++){
        System.out.print(" ");
      }

      for(int j=0;j<=pos;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
