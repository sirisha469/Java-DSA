//https://leetcode.com/problems/longest-string-chain/description/

package Memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
  
  public static void main(String[] args) {
    
    String[] words = {"a","b","ba","bca","bda","bdca"};

    System.out.println(longestStrChain(words));

  }

  public static int longestStrChain(String[] words) {
      
    Arrays.sort(words, (a, b) -> a.length() - b.length());
    int count = 0;
    
    Map<String, Integer> memo = new HashMap<>();

    for(String word: words){
      memo.put(word, 1);

      for(int i=0; i< word.length(); i++){

        StringBuilder current = new StringBuilder(word);
        String next = current.deleteCharAt(i).toString();

        if(memo.containsKey(next)){
            memo.put(word, Math.max(memo.get(word), memo.get(next)+1));
        }

      }
      count = Math.max(count, memo.get(word));
    }

    return count;
  }
}
