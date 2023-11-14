package CodeBlog;

public class Palindrome {
  public static void main(String[] args) {
    // String str = "madam";
    // // int number = 121;
    // //String str = String.valueOf(number);
    // String reverseStr="";
    // String s = str.toLowerCase();
    // System.out.println("Original:"+s);
    // for(int i=s.length()-1;i>=0;i--){
    //   reverseStr += s.charAt(i);
    // }
    // System.out.println("Reversed:"+str);
    // if(s. equals(reverseStr)){
    //     System.out.println("String is palindrome");
    // }
    // else{
    //     System.out.println("String is not a palindrome");
    // }

    // palindrome(str);



    int num = 3553, reversedNum = 0, rem;
    
    // store the number to originalNum
    int originalNum = num;
    
    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      rem = num % 10;
      reversedNum = reversedNum * 10 + rem;
      num /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }

  public static void palindrome(String s){
    int start = 0, end = s.length()-1;

    while(start < end){
      if(s.charAt(start)!=s.charAt(end)){
        System.out.println("String is not a palindrome");
        System.exit(0);
      }
      start++;
      end--;
    }
    System.out.println("String is palindrome");
  }
}
