package Backtracking;

public class MazePathRestricted {
  public static void main(String[] args) {
    boolean[][] maze = {
      {true,true,true},
      {true,false,true},
      {true,true,true}
    };

    pathRestricted("", maze, 0, 0);
  }

  public static void pathRestricted(String p,boolean[][] maze,int r,int c){
    if(r==maze.length-1 && c==maze.length-1){
      System.out.println(p);
      return;
    }

    if(!maze[r][c]){
      return;
    }

    if(r<maze.length-1){
      pathRestricted(p+'D', maze, r+1, c);
    }

    if(c<maze[0].length-1){
      pathRestricted(p+'R', maze, r, c+1);
    }
  }
}
