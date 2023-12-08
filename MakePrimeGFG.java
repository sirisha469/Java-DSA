//https://www.geeksforgeeks.org/problems/transform-to-prime4635/1
public class MakePrimeGFG {
  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 12};
    int N = 5;

    System.out.println(minNumber(arr, N));
  }

  public static int minNumber(int arr[], int N)
  {
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
  
    return makePrime(sum)-sum;
  }
    
  public static int makePrime(int num)
  {    
    if(isPrime(num)){
      return num;
    }
    else{
      num++;
      return makePrime(num);
    }
    // return num;
  }
    
  public static boolean isPrime(int num){
    if(num <= 1){
      return false;
    }
    
    for(int i=2;i*i<=num;i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
}
