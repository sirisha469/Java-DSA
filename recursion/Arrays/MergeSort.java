package Recursion.Arrays;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = {4,3,5,2,1};
    // int[] ans = mergeSort(arr);
    mergeSortInPlace(arr, 0, arr.length);
    System.out.println(Arrays.toString(arr));
  }

  public static int[] mergeSort(int[] arr){
    if(arr.length == 1){
      return arr;
    }

    int mid = arr.length/2;

    int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left,right);
  }

  public static int[] merge(int[] left,int[] right){
    int[] mix = new int[left.length + right.length];

    int i=0,j=0,k=0;

    while(i<left.length && j<right.length){
      if(left[i]<right[j]){
        mix[k] = left[i];
        i++;
      }
      else{
        mix[k] = right[j];
        j++;
      }
      k++;
    }

    while(i<left.length){
      mix[k] = left[i];
      i++;
      k++;
    }

    while(j<right.length){
      mix[k] = right[j];
      j++;
      k++;
    }

    return mix;
  }



  //MergeSort In place
  public static void mergeSortInPlace(int[] arr,int s,int e){
    if(e-s == 1){
      return;
    }

    int mid = (e+s)/2;

    mergeSortInPlace(arr, s, mid);
    mergeSortInPlace(arr, mid, e);

    mergeInPlace(arr,s,mid,e);
  }

  public static void mergeInPlace(int[] arr,int start,int mid,int end){
    int mix[] = new int[end-start];

    int i=start;
    int j=mid;
    int k=0;

    while(i<mid && j<end){
      if(arr[i] < arr[j]){
        mix[k] = arr[i];
        i++;
      }
      else{
        mix[k] = arr[j];
        j++;
      }
      k++;
    }

    while(i<mid){
      mix[k] = arr[i];
      i++;
      k++;
    }
    while(j<end){
      mix[k] = arr[j];
      j++;
      k++;
    }

    for(int l=0;l<mix.length;l++){
      arr[start+l] = mix[l];
    }

  }

}
