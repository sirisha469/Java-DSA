package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class NestedArrayList {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        
    nums.add(new ArrayList<>(List.of(1,2,3)));
    nums.add(new ArrayList<>(List.of(4,5,6)));
    nums.add(new ArrayList<>(List.of(7,8,9)));

    System.out.println(nums);

    for(int i=0;i<nums.size();i++){
      for(int j=0;j<nums.get(i).size();j++){
        System.out.print(nums.get(i).get(j)+" ");
      }
    }
  }
}
