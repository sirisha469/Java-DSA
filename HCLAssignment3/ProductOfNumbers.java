package HCLAssignment3;

import java.util.Scanner;

public class ProductOfNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N value:");
    int N = sc.nextInt();
    int prod = 1;
    for(int i=2;i<=N;i++){
      prod *= i;
    }
    System.out.println("Product of numbers: "+prod);
    sc.close();
  }
}
