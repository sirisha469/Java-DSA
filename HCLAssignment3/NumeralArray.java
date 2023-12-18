package HCLAssignment3;

import java.util.Arrays;
import java.util.Scanner;

public class NumeralArray {
  static void display(int[] a){
    System.out.println("Displaying array:");
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("Arrays.toString: "+Arrays.toString(a));
  }

  static int arraySum(int[] a){
    int sum = 0;
    for(int i=0;i<a.length;i++){
      sum+=a[i];
    }
    return sum;
  }

  static void averageArr(int[] a){
    System.out.println("Average of array: "+arraySum(a)/a.length);
  }

  static void arrayMax(int[] a){
    int maximum=0;
    for(int i=0;i<a.length;i++){
      if(maximum<a[i]){
        maximum = a[i];
      }
    }
    System.out.println("Maximum number of array:"+maximum);
  }

  static void arrayMin(int[] a){
    int minimum=a[0];
    for(int i=0;i<a.length;i++){
      if(minimum>a[i]){
        minimum = a[i];
      }
    }
    System.out.println("Minimum number of array:"+minimum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array vaues:");
    int[] array = new int[10];
    for(int i=0;i<10;i++){
      array[i] = sc.nextInt();
    }

    display(array);
    System.out.println("Array sum: "+arraySum(array));
    averageArr(array);
    arrayMax(array);
    arrayMin(array);

    sc.close();
  }
}
