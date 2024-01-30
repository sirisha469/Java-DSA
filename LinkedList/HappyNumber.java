//https://leetcode.com/problems/happy-number/description/
package LinkedList;

public class HappyNumber {

  public boolean isHappy(int n){
    int slow = n;
    int fast = n;

    do{
      slow = findSquare(slow);
      fast = findSquare(fast);
    }while(slow!=fast);

    if(slow == 1){
      return true;
    }

    return false;
  }

  public int findSquare(int n){
    int ans = 0;

    while(n>0){
      int rem = n%10;
      ans += rem * rem;
      n /= 10;
    }

    return ans;
  }
  public static void main(String[] args) {
    int n = 12;
    HappyNumber h = new HappyNumber();
    System.out.println(h.isHappy(n));
  }
}
