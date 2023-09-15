// 4 4 4 4 4 4 4  
// 4 3 3 3 3 3 4   
// 4 3 2 2 2 3 4   
// 4 3 2 1 2 3 4   
// 4 3 2 2 2 3 4   
// 4 3 3 3 3 3 4   
// 4 4 4 4 4 4 4   

package patterns;

public class pattern6 {
  public static void main(String[] args) {
    pattern(4);
  }

  static void pattern(int n){
    int num= 2*n;
    for(int row=0; row<=num; row++){
      for(int col=0; col<=num; col++){
        int inEveryIndex = n-Math.min( Math.min(row, col), Math.min(num-row, num-col) );
        System.out.print(inEveryIndex+1+" ");
      }
      System.out.println();
    }
  }

}
