//https://leetcode.com/problems/integer-break/description/?envType=daily-question&envId=2023-10-06

public class IntegerBreak {
  public static void main(String[] args) {
    System.out.println(integerBreak(10));
  }

  public static int integerBreak(int n) {
    if (n == 2)
        return 1; // 1 * 1
    if (n == 3)
        return 2; // 1 * 2

    int ans = 1;

    while (n > 4) {
        n -= 3;
        ans *= 3;
    }
    ans *= n;

    return ans;
}
}
