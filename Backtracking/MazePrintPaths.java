package Backtracking;

import java.util.ArrayList;

public class MazePrintPaths {
  
  public static void main(String[] args) {
    System.out.println(pathsList("", 3, 3));
  }

  public static ArrayList<String> pathsList(String p,int r,int c){
    if(r==1 && c==1){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> list = new ArrayList<>();
    if(r>1){
      list.addAll(pathsList(p+'D',r-1,c));
    }

    if(c>1){
      list.addAll(pathsList(p+'R',r,c-1));
    }

    return list;
  }
}
