//https://www.geeksforgeeks.org/problems/how-many-xs4514/1
package CodeBlog;

import java.util.HashMap;

public class XInRange {
  public static void main(String[] args) {
    int L=10, R=19, X=1;
    //excluding L and R
    System.out.println(countX(L,R,X));
  }
  static int countX(int L, int R, int X) {
    int count=0;
    for(int i=L+1;i<R;i++){
      count+=countValue(i,X);
        
    }
    return count;
    }
    
    public static int countValue(int n,int X){
      int c=0;
      while(n!=0){
        int rem = n%10;
        if(rem==X){
          c++;
        }
        n/=10;
      }
      return c;
    }
}
