package CodeBlog;

public class Fibonacci {
  public static void main(String[] args) {
    int num = 5;

    //int a=0,b=1,c=0;
    //System.out.print("Fibonacci sequence: "+a+" "+b+" ");

    //Method1
    // for(int i=2;i<num;i++){
    //   c = a+b;
    //   System.out.print(c+" ");
    //   a=b;
    //   b=c;
    // }

    //method 2
    // while(i<num){
    //   c = a+b;
    //   System.out.print(c+" ");
    //   a=b;
    //   b=c;
    //   i++;
    // }

    //method 3: up to a given number
    // while((a+b)<=num){
    //   c = a+b;
    //   System.out.print(c+" ");
    //   a = b;
    //   b = c;
    // }

    //int ans = fibonacci(5);
    System.out.print("Fibonacci sequence: ");
    for(int i=0;i<num;i++){
      System.out.print(fibonacci(i)+" ");
    }
    //System.out.println(ans);
  }

  static int fibonacci(int n){
    if(n < 2){
      return n;
    }

    return fibonacci(n-1) + fibonacci(n-2);
  } 
}
