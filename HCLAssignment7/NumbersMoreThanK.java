package HCLAssignment7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class NumbersMoreThanK {
  public static void main(String[] args) {
    int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
    int k=4;

    int size = arr.length/k;

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for(Map.Entry<Integer,Integer> m:map.entrySet()){
      if(m.getValue()>size){
        ans.add(m.getKey());
      }
    }
    System.out.println(ans);

  }
}
