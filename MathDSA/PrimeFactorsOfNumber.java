package MathDSA;

public class PrimeFactorsOfNumber {
  public static void main(String[] args) {
    int n=10;

    int count = 0;
    for(int i=2;i*i<=n;i++){
      while(n%i==0){
        System.out.print(i+" ");
        n/=i;
        count++;
      }
      if(n>1){
        count++;
        System.out.println(n);
      }
    }
    //number of prime factors of a number
    System.out.println(count);

    sumOfPowers(9, 12);
  }

  public static void sumOfPowers(long a, long b) {
    // code here
    long count = 0;
    for(long i=a;i<=b;i++){
        long p=2;
        long n = i;
        while(p*p<=n){
            if(i%p==0){
                count++;
                i/=p;
                System.out.println(count);
            }
            else{
                p++;
            }
        }
    }
    // return count;
}
}
