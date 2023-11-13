package CodeBlog;

public class Prime {
  public static void main(String[] args) {
    int n = 18;

    // for(int i=2;i<n;i++){
    //   if(n%i==0){
    //     System.out.println("Not a prime");
    //     System.exit(0);
    //   }
    // }
    // System.out.println("Prime");


    // if(count==2){
    //   System.out.println("Prime");
    // }
    // else{
    //   System.out.println("Not a prime");
    // }

    // for(int i=2;i*i<n;i++){
    //   if(n%i==0){
    //     System.out.println("Not a prime");
    //     System.exit(0);
    //   }
    // }
    // System.out.println("Prime");

    // int n = 6;
    double val = Math.round(Math.sqrt(n));
    for(int i=2;i<=val;i++){
      if(n%i==0){
        System.out.println("Not a prime");
        System.exit(0);
      }
    }
    System.out.println("Prime");
  }
}
