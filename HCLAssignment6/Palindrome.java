package HCLAssignmentThreads;

public class Palindrome implements Runnable{
  @Override
  public void run(){
    int count=1;
    for(int i=100;i<=1000;i++){
      if(isPalindrome(i) && count<21){
        System.out.println(i);
        count++;
      }
    }
  }

  public boolean isPalindrome(int n){
    String s = n+"";
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    if(s.equals(sb.toString())){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Palindrome p = new Palindrome();
    Thread t = new Thread(p);
    t.start();
  }
}
