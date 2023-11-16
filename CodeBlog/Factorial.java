package CodeBlog;

public class Factorial {
  public static void main(String[] args) {
    int n= 6, fact=1, i=1;

    // for(int i=1;i<=n;i++){
    //   fact = fact * i;
    // }

    //It print the n value and the cursor it at the same line.
    //System.out.print(n);
    while(i<=n){
      fact = fact * i;
      i++;
    }

    //In that same line the factorial value is also print
    System.out.println(n+" Factorial is "+fact);
    //In every iteration n value decreases
    //System.out.println(n+" Factorial is "+fact);
    int num = 4;
    
    System.out.println(num+" Factorial is "+Main(num));


  }

  public static int Main(int n){
    if(n==0)
      return 1;
    
    return n * Main(n-1);
  }
}
