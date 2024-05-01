package Memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MaxPathSum {
  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(1,2,3);
    List<List<Integer>> grid = new ArrayList<>();
    grid.add(l);
    grid.add(l);
    //grid.add(l);
    System.out.println(maxPathSum(0, 0, grid));
    //System.out.println(countPaths(0, 0, grid,new HashMap<>()));
  }

  public static double maxPathSum(int r,int c,List<List<Integer>> grid){
    if(r==grid.size() || c==grid.size()){
      return Double.NEGATIVE_INFINITY;
    }

    if(r==grid.size()-1 && c == grid.size()-1){
      return grid.get(r).get(c);
    }

    return grid.get(r).get(c) + Math.max(maxPathSum(r+1, c, grid),maxPathSum(r, c+1, grid));

  }
}
