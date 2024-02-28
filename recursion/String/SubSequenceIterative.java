package Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceIterative {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    // List<List<Integer>> ans = subSeq(arr);
    // for(List<Integer> n:ans){
    //   System.out.println(n);
    // }

    subSeqNoReturn(arr);
  }  

  static List<List<Integer>> subSeq(int[] arr){
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    for(int num:arr){
      int n= outer.size();
      System.out.println(n);
      for(int i=0;i<n;i++){
        List<Integer> internal = new ArrayList<>(outer.get(i));
        System.out.println(internal);
        internal.add(num);
        System.out.println(internal);
        outer.add(internal);
      }
    }

    return outer;
  }

  //without returning
  static void subSeqNoReturn(int[] arr){
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    for(int num:arr){
      int n= outer.size();
      System.out.println(n);
      for(int i=0;i<n;i++){
        List<Integer> internal = new ArrayList<>(outer.get(i));
        
        internal.add(num);
        System.out.println(internal);
        
        outer.add(internal);
        System.out.println(outer);
      }
    }

    // for(List<Integer> n:outer){
    //   System.out.println(n);
    // }
  }
}
