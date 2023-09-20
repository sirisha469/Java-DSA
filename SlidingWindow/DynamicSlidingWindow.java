package SlidingWindow;

public class DynamicSlidingWindow {
  
  public static void main(String[] args) {
    int k = 5;
    int[] a = {1,1,4,2,3};
    System.out.println(slidingWindow(a, k));
  }

  //finding the sum of minimum elements that is greater than are equal to k
  public static int slidingWindow(int[] a, int k){

    int start = 0, end = 0, current_sum = 0, minLength = Integer.MAX_VALUE;

    while(end < a.length){
      current_sum = current_sum +a[end];
      end++;


      while(start < end && current_sum >= k){
        current_sum = current_sum - a[start];
        start++;

        // count = the number of values sum together
        int count = end - start + 1;

        minLength = Math.min(minLength, count);
      }

    }
    return minLength;
  }
}
