//https://leetcode.com/problems/backspace-string-compare/description/?envType=daily-question&envId=2023-10-19
package Stack;

import java.util.Stack;

public class BackspaceStringCompare {
  
  public static void main(String[] args) {
    String s = "ab#c",t="ad#c";

    System.out.println(backspaceCompare(s,t));
  }

  public static boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }

    public static String backSpace(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#' && !stack.empty()){
                stack.pop();
            }
            else if(s.charAt(i) != '#'){
                stack.push(s.charAt(i));
            }
        }

        String str = "";
        for(int i=0;i<stack.size();i++){
            str+=stack.get(i);
        }
        return str;
    }
}
