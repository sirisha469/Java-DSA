    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5


package patterns;
public class patterns5 {
  public static void main(String[] args) {
    pattern(5);
  }

  static void pattern(int n){
    
    for(int row=1; row<=n; row++){

      //for spaces
      for(int s=0; s < n-row; s++){
        System.out.print("  ");
      }

      for(int col=row; col >= 1;col--){
        System.out.print(col+" ");
      }

      for(int col=2; col<=row;col++){
        System.out.print(col+" ");
      }

      System.out.println();

    }
  }
}
