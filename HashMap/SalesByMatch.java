//https://www.hackerrank.com/contests/mountblue-technologies/challenges/sock-merchant
package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    // 10 20 20 10 10 30 50 10 20
    list.add(10);
    list.add(20);
    list.add(20);
    list.add(10);
    list.add(10);
    list.add(30);
    list.add(50);
    list.add(10);
    list.add(20);
    sockMerchant(9,list);
  }
    
  public static void sockMerchant(int n, List<Integer> ar) {
    int count=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
        if(map.containsKey(ar.get(i))){
            map.put(ar.get(i), map.get(ar.get(i))+1);
        }
        else{
            map.put(ar.get(i), 1);
        }
    }
    // System.out.println(map);
    for(Map.Entry<Integer,Integer> m:map.entrySet()){
        int val=(int)(m.getValue());
        System.out.println("val:"+val);
        if(val/2 > 0){
            count+=val/2;
            // System.out.println("count:"+count);
        }
    }
    System.out.println(count);
    // return count;

}
}
