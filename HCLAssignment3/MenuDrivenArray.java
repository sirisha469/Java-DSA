package HCLAssignment3;

import java.util.Arrays;
import java.util.Scanner;

public class MenuDrivenArray {
  static void arraySecondHighest(int[] a){
    // Arrays.sort(a);
    sortArray(a);
    System.out.println("Second highest number: "+a[a.length-2]);
  }

  static void sortArray(int[] a){
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    //System.out.println(Arrays.toString(a));
  }

  static void duplicateElement(int[] a){
    sortArray(a);
    for(int i=0;i<a.length-1;i++){
      if(a[i] == a[i+1]){
        System.out.println("Duplicate element: "+a[i]);
        System.exit(0);
      }
    }
    System.out.println("There is no duplicate element");
  }

  static void reverseArray(int[] a){
    int start = 0, end = a.length-1;
    while(start<end){
      int temp = a[start];
      a[start] = a[end];
      a[end] = temp;
      start++;
      end--;
    }
  }

  static void mergeArray(int[] a1,int[] a2){
    int len1 = a1.length;
    int len2 = a2.length;

    int[] arr = new int[len1+len2];

    System.arraycopy(a1, 0, arr, 0, len1);
    for(int i=0;i<len2;i++){
      arr[len1+i] = a2[i];
    }

    System.out.println(Arrays.toString(arr));
  }

  static void removeElement(int[] a,int val){
    int[] arr = new int[a.length-1];
    int j=0;
    for(int i:a){
      if(i!=val){
        arr[j] = i;
        j++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Find Second highest in array");
    System.out.println("2. Sort an array");
    System.out.println("3. Find duplicate element in array");
    System.out.println("4. Reverse an array");
    System.out.println("5. Merge two arrays");
    System.out.println("6. Remove an element from an array");
    System.out.println("your choice:");
    int n = sc.nextInt();

    switch(n){
      case 1: 
            System.out.println("Enter array size:");
            int x1 = sc.nextInt();
            System.out.println("Enter array elements:");
            int[] a1 = new int[x1];
            for(int i=0;i<x1;i++){
              a1[i] = sc.nextInt();
            }
            arraySecondHighest(a1);
            break;
      case 2: 
            System.out.println("Enter array size:");
            int x2 = sc.nextInt();
            System.out.println("Enter array elements:");
            int[] a2 = new int[x2];
            for(int i=0;i<x2;i++){
              a2[i] = sc.nextInt();
            }
            sortArray(a2);
            System.out.println(Arrays.toString(a2));
            break;
      case 3: 
            System.out.println("Enter array size:");
            int x3 = sc.nextInt();
            System.out.println("Enter array elements:");
            int[] a3 = new int[x3];
            for(int i=0;i<x3;i++){
              a3[i] = sc.nextInt();
            }
            duplicateElement(a3);
            break;
      case 4: 
            System.out.println("Enter array size:");
            int x4 = sc.nextInt();
            System.out.println("Enter array elements:");
            int[] a4 = new int[x4];
            for(int i=0;i<x4;i++){
              a4[i] = sc.nextInt();
            }
            reverseArray(a4);
            System.out.println(Arrays.toString(a4));
            break;
      case 5: 
            System.out.println("Enter array1 size:");
            int x5 = sc.nextInt();
            System.out.println("Enter array1 elements:");
            int[] a5 = new int[x5];
            for(int i=0;i<x5;i++){
              a5[i] = sc.nextInt();
            }
            System.out.println("Enter array2 size:");
            int x = sc.nextInt();
            System.out.println("Enter array2 elements:");
            int[] a = new int[x];
            for(int i=0;i<x;i++){
              a[i] = sc.nextInt();
            }
            mergeArray(a5,a);
            // System.out.println(Arrays.toString(a4));
            break;
      case 6: 
            System.out.println("Enter array size:");
            int x6 = sc.nextInt();
            System.out.println("Enter array elements:");
            int[] a6 = new int[x6];
            for(int i=0;i<x6;i++){
              a6[i] = sc.nextInt();
            }
            System.out.println("Enter element to remove: ");
            int val = sc.nextInt();
            removeElement(a6,val);
            break;
    }
    sc.close();
  }
}
