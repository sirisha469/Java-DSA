// patter1 
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *

// patter2
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

package patterns;

public class pattern11 {
  public static void main(String[] args) {
    //pattern1(5);
    pattern2(5);
  }

  static void pattern1(int n){

    for(int i=0; i<n; i++){

      for(int s=0; s<n-i-1;s++){
        System.out.print(" ");
      }

      for(int j=0; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

  }


  static void pattern2(int n){
    for(int i=n; i>0; i--){

      for(int s=0; s<n-i; s++){
        System.out.print(" ");
      }

      for(int j=0;j<i;j++){
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
