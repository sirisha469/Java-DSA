//https://leetcode.com/problems/plus-one/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

package TopInterviewQuestions;

import java.util.Arrays;

public class PlusOne {
  
  public static void main(String[] args) {
    int[] a = {4, 2, 3};
    int[] a1 = {9};
    int[] a2 = {4, 8, 9};
    System.out.println(Arrays.toString(plusOne(a)));
    System.out.println(Arrays.toString(plusOne(a1)));
    System.out.println(Arrays.toString(plusOne(a2)));
  }


  public static int[] plusOne(int[] digits) {
    int len=digits.length;

    for(int i=len-1; i>=0; i--){
        if(digits[i]<9){
            digits[i]++;
            break;
        }
        else{
            digits[i] = 0;
        }
    }

    if(digits[0] == 0){
        digits = new int[digits.length+1];
        digits[0] = 1;
    }

    return digits;
}
}
