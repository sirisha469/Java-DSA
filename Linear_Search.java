public class Linear_Search {
  public static void main(String[] args) {
    int[] arr={12,3,45,23,6,18};
    int ans=linearSearch(arr,3);
    System.out.println("Index:"+ans);

    int ans1=linearSearch1(arr,12);
    System.out.println("Element:"+ans1);

    boolean ans2=linearSearch2(arr,12);
    System.out.println("Boolean value:"+ans2);
  }

  //If target found it will return index else -1
  static int linearSearch(int[] arr, int target) {
    if(arr.length == 0){
      return -1;
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i] == target){
        return i;
      }
    }
    return -1;
  }

  //If target found it will return element else some constant (-1 it will not return -1 because -1 will be the element also some time)
  static int linearSearch1(int[] arr, int target) {
    if(arr.length == 0){
      return Integer.MAX_VALUE;
    }
    for(int element:arr){
      if(element == target){
        return target;
      }
    }
    return Integer.MAX_VALUE;
  }

  static boolean linearSearch2(int[] arr, int target) {
    if(arr.length == 0){
      return false;
    }
    for(int element:arr){
      if(element == target){
        return true;
      }
    }
    return false;
  }
}
