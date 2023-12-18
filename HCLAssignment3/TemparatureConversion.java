package HCLAssignment3;

import java.util.Scanner;

public class TemparatureConversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperature:");
    double temp = sc.nextDouble();
    double celcius = temp-32 / 1.8;
    System.out.printf("%-15s%s","Fohrenheit","celcius");
    System.out.println();
    System.out.println("---------------------------");
    System.out.printf("%-15f%.2f",temp,celcius);

    sc.close();
  }
}
