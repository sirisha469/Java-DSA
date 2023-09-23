//https://leetcode.com/problems/valid-parentheses/
package Strings;

import java.util.ArrayList;

public class ValidParentheses{
  public static void main(String[] args) {
    String s = "()[]{}";
    isValid(s);
  }

  public static void isValid(String s) {
        
        ArrayList<Character> list = new ArrayList<>();
        list.add('*');
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
                //return false;
                System.out.println(false);
            }

            else if(ch == '(' || ch == '[' || ch == '{'){
                list.add(ch);
                //System.out.println(list);
            }
            else{
                char s1 =list.get(list.size()-1);
                
                if( (s1 == '(' && ch==')') ||  (s1 == '[' && ch==']') || (s1 == '{' && ch=='}'))
                {
                    list.remove(list.get(list.size()-1));
                }
                else{
                    list.add(ch);
                }
                
            }
            //System.out.println(list);
        }

        System.out.println(list);
        if(list.size() == 1)
            System.out.println(true);
        else 
            System.out.println(false);
    }
}