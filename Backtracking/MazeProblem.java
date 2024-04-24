package Backtracking;


public class MazeProblem{
  public static void main(String[] args) {
    System.out.println("Number of paths: "+maze(4,4));

  }

  public static int maze(int r,int c){
    if(r==1 || c==1){
      return 1;
    }

    int left = maze(r-1,c);
    int right = maze(r,c-1);

    return left+right;
  }

}