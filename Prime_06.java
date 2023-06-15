public class Prime_06{
  public static void main(String[] args) {
    System.out.println("Hello"); 
    int num = 29;
    int c = 2;

    //System.out.println(Math.round(Math.sqrt(num)));
    //System.out.println(Math.round(Math.pow(num,0.5)));
    double val = Math.round(Math.sqrt(num));
    if(num<=1){
      System.out.println("Neither prime nor composite");
    }
    while(c <= val){

      if(num%c == 0){
        System.out.println("Not a prime");
        System.exit(0);
      }
      c+=1;

    }
    System.out.println("Prime");
    
  }
}