package MathDSA;

class SqrtOfNumber{
  public static void main(String[] args) {
    int n = 40;
    int p = 3;//nuber of decimal points

    sqrt(n,p);
  }

  //time complexity = O(log(n))
  public static void sqrt(int n,int p){
    double root = 0.0;

    int start = 0,end = n;

    while(start<=end){
      int mid = start + (end-start)/2;

      if(mid * mid == n){
        root =  mid;
      }
      if(mid * mid > n){
        end = mid - 1;
      }
      else{
        start = mid + 1;
      }
    }

    double increment = 0.1;
    for(int i=0;i<p;i++){
      while(root * root <= n){
        root+=increment;
      }
      //System.out.println(root);
      //System.out.println(increment);

      //increment number is subtracted from the root because we want before the while condition root 
      root = root - increment;

      //next increment = 0.01 so divide increment by 10
      increment/=10;
    }
    System.out.printf("%.3f",root);
    
  }


}