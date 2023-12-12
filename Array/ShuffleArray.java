package Array;
import java.util.Arrays;

public class ShuffleArray {
  public static void main(String[] args) {
    int[] arr = {2,5,1,3,4,7};
    System.out.println(Arrays.toString(shuffle(arr, 3)));
  }

  public static int[] shuffle(int[] nums, int n) {
    int len = nums.length;
    int[] ans = new int[len];
    for(int i=0;i<n;i++){
        ans[2*i]= nums[i];
        ans[2*i+1] = nums[n+i];
    }
    
    return ans;
  }
}
