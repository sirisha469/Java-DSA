package BinarySearch;
public class OrderAgnosticsBS {
  public static void main(String[] args) {
    int[] arr={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 89};
    int target= 15;
    int ans=orderAgnosticsBS(arr, target);
    System.out.println("Ascending order array: "+ans);

    int[] arr2={89, 75, 63, 52, 40, 39, 21, 2};
    int target2= 40;
    int ans2=orderAgnosticsBS(arr2, target2);
    System.out.println("Descending order array: "+ans2);
  }

  static int orderAgnosticsBS(int[] arr, int target){
    int start=0, end=arr.length-1;

    //finding that array is sorted in ascending or decending order
    boolean isAsc= arr[start] < arr[end];


    while(start <= end){
      //finding middle element
      int mid=(start+end)/2;
      //int mid=start+(end-start)/2;

      if(arr[mid] == target){
        return mid;
      }
      
      if(isAsc){
        if(target > arr[mid]){
          start=mid+1;
        }else{
          end=mid-1;
        }
      }
      else{
        if(target > arr[mid]){
          end=mid-1;
        }else{
          start=mid+1;
        }
      }
    }
    return -1;
  }
}
