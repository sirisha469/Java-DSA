package Recursion;

public class BinarySearch{

  public static void main(String[] args) {
    int[] arr = {1, 2, 5, 20, 34, 57, 90};
    int target = 20;

    System.out.println("Index of target: "+search(arr, target, 0, arr.length-1));
  }

  public static int search(int[] arr, int target, int start, int end){

    if(start > end){
      return -1;
    }

    int mid = start + (end-start)/2;

    if(arr[mid] == target){
      return mid;
    }

    if(target < arr[mid]){
      return search(arr, target, start, mid-1);
    }

    return search(arr, target, mid+1, end);
  }
}