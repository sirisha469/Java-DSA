import java.util.Arrays;

public class SearchIn2DArray {
  public static void main(String[] args) {
    int[][] arr = { 
      {1, 2, 3}, 
      {9, 18, 5}, 
      {6, 78, 14},
      {12, 45, 23, 67}
    };

    int target = 12;
    int[] ans=search(arr,target);
    System.out.println(Arrays.toString(ans));
    // int max=Integer.MIN_VALUE;
    // System.out.println(max);

    int max=max(arr);
    System.out.println(max);
  }

  static int[] search(int[][] arr, int target){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(arr[i][j] == target){
          return new int[]{i,j};
        }
      }
    }
    return new int[]{-1,-1};
  }

  static int max(int[][] arr){
    int max=Integer.MIN_VALUE;
    for(int[] i:arr){
      for(int j:i){
        if(j > max){
          max=j;
        }
      }
    }
    return max;
  }

}
