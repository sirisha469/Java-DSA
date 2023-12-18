package HCLAssignment3;

import java.util.Arrays;
import java.util.Scanner;

public class MenuDrivenArray {
  static void arraySecondHighest(int[] a){
    Arrays.sort(a);
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
    System.out.println(Arrays.toString(a));
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
            break;
    }
    sc.close();
  }
}
