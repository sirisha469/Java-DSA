    //     *
    //    ***
    //   *****
    //  *******
    // *********


    // *********
    //  *******
    //   *****
    //    ***
    //     * 

package patterns;

public class pattern10 {
  public static void main(String[] args) {
    //pattern1(5);
    pattern2(5);
  }

  static void pattern1(int n){
    int num = n;
    for(int i=1; i<=2*n-1; i++){
        if(i%2!=0){
            for(int s=0; s<num-1;s++){
                System.out.print(" ");
            }
            num=num-1;
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.err.println();
        }
    }
  }


  static void pattern2(int n){
    int num =  n;
    for(int i=2*n-1; i>=1; i--){
        if(i%2!=0){
            for(int s=n; s>num; s--){
                System.out.print(" ");
            }
            num-=1;
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
  }

}
