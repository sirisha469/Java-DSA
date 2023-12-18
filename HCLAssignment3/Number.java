package HCLAssignment3;

import java.util.Scanner;

public class Number {
  private double d;

  //A
  boolean isZero(){
    if(d == 0){
      return true;
    }
    return false;
  }

  boolean isPositive(){
    if(d > 0){
      return true;
    }
    return false;
  }

  boolean isNegative(){
    if(d < 0){
      return true;
    }
    return false;
  }

  boolean isOdd(){
    if(d%2 == 1){
      return true;
    }
    return false;
  }

  boolean isEven(){
    if(d%2 == 0){
      return true;
    }
    return false;
  }

  boolean isPrime(){
    for(int i=2;i*i<=d;i++){
      if(d%i==0){
        return false;
      }
    }
    return true;
  }

  boolean isAmstrong(){
    int ans =0;
    int temp = (int)d;
    int val = temp;
    while(temp!=0){
      int rem = temp%10;
      ans += (rem*rem*rem);
      temp/=10;
    }
    if(val == ans)
      return true;
    else
      return false;
  }

  //B
  double getFactorial(){
    double fact=1;
    for(int i=2;i<=d;i++){
      fact*=i;
    }
    return fact;
  }

  double getSqrt(){
    double sqrt = Math.pow(d , 0.5);
    return sqrt;
  }

  double getSqr(){
    return d*d;
  }

  double sumDigits(){
    double sum=0;
    while(d>0){
      int rem = (int)d%10;
      sum+=rem;
      d/=10;
    }
    return sum;
  }

  double getReverse(){
    double rev=0;
    int temp = (int)d;
    while(temp>0){
      int rem = temp%10;
      rev=rev*10+rem;
      temp/=10;
    }
    return rev;
  }
  public static void main(String[] args) {
    Number obj = new Number();
    Scanner sc = new Scanner(System.in);
    obj.d = sc.nextDouble();
    System.out.println(obj.isZero());
    System.out.println(obj.isPositive());
    System.out.println(obj.isNegative());
    System.out.println(obj.isOdd());
    System.out.println(obj.isEven());
    System.out.println(obj.isPrime());
    System.out.println(obj.isAmstrong());
    System.out.println(obj.getFactorial());
    System.out.println(obj.getSqrt());
    System.out.println(obj.getSqr());
    System.out.println(obj.sumDigits());
    System.out.println(obj.getReverse());
    sc.close();
  }
}
