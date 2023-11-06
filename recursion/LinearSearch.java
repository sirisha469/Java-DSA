package Recursion;

import java.util.ArrayList;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {2,6,3,8,8,9};
    int target = 8;
    System.out.println(linearSearch(arr, target, 0));
    System.out.println(index(arr, target, 0));
    System.out.println(indexLast(arr, target, arr.length-1));

    findAllIndex(arr, target, 0);
    System.out.println(list);

    System.out.println(findAllReturnArrayList(arr, target, 0, new ArrayList<Integer>()));
  }

  public static boolean linearSearch(int[] arr,int target, int index){
    if(index == arr.length){
      return false;
    }

    return arr[index] == target || linearSearch(arr, target, index+1);
  }

  public static int index(int[] arr,int target,int index){
    if(index == arr.length){
      return -1;
    }

    if(arr[index] == target){
      return index;
    }
    else{
      return index(arr,target,index+1);
    }
  }

  public static int indexLast(int[] arr,int target,int index){
    if(index == -1){
      return -1;
    }

    if(arr[index] == target){
      return index;
    }
    else{
      return indexLast(arr, target, index-1);
    }
  }

  //storing all the indexes in arraylist
  static ArrayList<Integer> list = new ArrayList<>();
  public static void findAllIndex(int[] arr,int target,int index){
    if(index == arr.length){
      return;
    }

    if(arr[index] == target){
      list.add(index);
    }
    findAllIndex(arr, target, index+1);
  }

  public static ArrayList<Integer> findAllReturnArrayList(int[] arr, int target,int index,ArrayList<Integer> list){
    if(index == arr.length){
      return list;
    }
    if(arr[index] == target){
      list.add(index);
    }
    return findAllReturnArrayList(arr, target, index+1, list);
  }

}
