//https://www.geeksforgeeks.org/problems/smith-number4132/1

public class SmithNumberPrime {
  public static void main(String[] args) {
    int n = 378;
    System.out.println(smithNum(n));
  }

  static int smithNum(int n) {      
    if(n<4){
      return 0;
    }
    
    int primeFactors = primeFactors(n);
    int digitSum = digitSum(n);
    
    return primeFactors == digitSum? 1:0;
  }

  static int primeFactors(int num){
    int primeSum = 0;
    for(int i=2;i*i<=num;i++)
    {
      while(num%i==0){
        if(i>9){
          primeSum+=digitSum(i);
        }
        else{
          primeSum+=i;
        }
        
        num/=i;
      }
    }
    
    if(num > 1){
      primeSum+=digitSum(num);
    }
    return primeSum;
  }

  static int digitSum(int num){
    int sum=0;
    while(num!=0){
      sum+=(num%10);
      num/=10;
    }
    return sum;
  }
}
