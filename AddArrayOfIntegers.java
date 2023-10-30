import java.util.ArrayList;
import java.util.List;

public class AddArrayOfIntegers {
  public static void main(String[] args) {
    int[] num = {1,2,0,0};
    int k =32;
    System.out.println(addToArrayForm(num,k));
  }
  public static List<Integer> addToArrayForm(int[] num, int k) {
      String s = "";
      for(int i=0;i<num.length;i++){
          s+=num[i];
      }
      int n = Integer.valueOf(s);

      int sum = n + k;
      ArrayList<Integer> list = new ArrayList<>();
      while(sum>0){
          int rem = sum%10;
          list.add(0,rem);
          sum/=10;
      }
      return list;
  }
}
