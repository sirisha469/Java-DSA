package HCLAssignment3;

public class LargeNumberOfDivisors {
  static int countDivisors(int n){
    int count =0;
    for(int i=1;i<=n;i++){
      if(n%i==0)
        count++;
    }
    return count;
  }
  public static void main(String[] args) {
    int largestDivisor = 0;
    int ans = 0;
    for(int i=2;i<=100;i++){
      int count = countDivisors(i);
      if(count>largestDivisor){
        largestDivisor = count;
        ans = i;
      }
    }

    System.out.println(largestDivisor+" divisors for "+ans);
    //largest divisor
    for(int i=1;i<=ans;i++){
      if(ans%i==0){
        System.out.println(i);
      }
    }
  }
}
