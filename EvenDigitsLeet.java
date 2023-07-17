//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigitsLeet {
  public static void main(String[] args) {
    int[] arr={12, 2, 24, 1345, 123};

    System.out.println(findDigits(arr));

  }

  static int findDigits(int[] arr){
    int count=0;

    for(int num: arr){
      boolean val=digits(num);
      if(val==true){
        count++;
      }
    }
    return count;
  }

  static boolean digits(int num) {
    int digits=countDigits3(num);
    
    return digits%2 ==0;
  }


  static int countDigits(int num) {
    int count=0;
    if(num < 0){
      num=num*-1;
    }
    while(num > 0){
      count++;
      num/=10;
    }
    return count;
  }

  static int countDigits2(int num) {
    String str=Integer.toString(num);
    int count=str.length();
    return count;
  }

  static int countDigits3(int num) {
    if(num < 0){
      num=num*-1;
    }
    return (int)(Math.log10(num)+1);
  }

}
