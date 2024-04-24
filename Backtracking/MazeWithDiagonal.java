package Backtracking;

import java.util.ArrayList;

public class MazeWithDiagonal {
  public static void main(String[] args) {
    System.out.println(mazeWithDiagonal("", 3, 3));
  }

  public static ArrayList<String> mazeWithDiagonal(String p,int r,int c){
    if(r==1 && c==1){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> list = new ArrayList<>();

    if(r>1 && c>1){
      //D for Diagonal
      list.addAll(mazeWithDiagonal(p+'D', r-1, c-1));
    }

    if(r>1){
      //V for vertical
      list.addAll(mazeWithDiagonal(p+'V', r-1, c));
    }

    if(c>1){
      //H for horizontal
      list.addAll(mazeWithDiagonal(p+'H', r, c-1));
    }

    return list;
  }

}
