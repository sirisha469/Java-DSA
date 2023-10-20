package MathDSA;
public class SievePrime {
  public static void main(String[] args) {
    int n=40;
    boolean[] primes = new boolean[n+1];

    sievePrime(n, primes);
  }

  public static void sievePrime(int n,boolean[] primes){
    for(int i=2; i*i<=n;i++){
      if(!primes[i]){
        for(int j=i*2;j<=n;j+=i){
          primes[j] = true;
        }
      }
    }

    for(int i=2;i<=n;i++)
    {
      if(!primes[i]){
        System.out.print(i+" ");
      }
    }
  }
}
