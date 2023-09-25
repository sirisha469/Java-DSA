//https://leetcode.com/problems/find-the-difference/description/
package Strings;

public class FindDifferenceStrings {
  
  public static void main(String[] args) {
    String s = "abc", t = "cabx";
    //output: x; the difference is x character

    System.out.println(findTheDifference(s,t));

  }

  public static char findTheDifference(String s, String t) {
    int i = 0, j = 0, sum1 = 0, sum2 = 0;
    while(i<s.length() || j < t.length()){

        if(i < s.length()){
            sum1 += s.charAt(i);
            i++;
        }

        if(j < t.length()){
            sum2 += t.charAt(j);
            j++;
        }

    }

    return (char) (sum2-sum1);

  }
}
