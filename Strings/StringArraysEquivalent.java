//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
package Strings;

class StringArraysEquivalent{

  public static void main(String[] args) {
    String arr1[] = {"ab", "c"};
    String arr2[] = {"a", "bc"};

    System.out.println(arrayStringsAreEqual1(arr1,arr2));
    System.out.println(arrayStringsAreEqual2(arr1,arr2));

  }

  public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {

    return String.join("",word1).equals(String.join("",word2));
  }

  public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
          
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for(String s:word1){
        sb1.append(s);
    }
    for(String s:word2){
        sb2.append(s);
    }
    boolean flag=false;
    if((sb1.toString().equals(sb2.toString()))){
        flag=true;
    }
    return flag;

  }
}