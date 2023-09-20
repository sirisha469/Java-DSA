package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FixedSlidingWindow {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6};
    int k=3;
    System.out.println(slidingWindow(a, k));
  }

  public static List<Integer> slidingWindow(int a[], int k){
    ArrayList<Integer> list = new ArrayList<>();
    int sum=0;
    for(int i=0; i<k;i++){
      sum+= a[i];
    }

    list.add(sum);

    for(int j=1; j<a.length-k+1;j++){
      sum = sum - a[j-1];
      sum = sum+a[j+k-1];

      list.add(sum);
    }
    
    return list;
  }
  
}
