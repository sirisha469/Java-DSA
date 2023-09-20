package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class CeilingofCharacterBS {
  public static void main(String[] args) {
    char[] ch = {'c', 'f', 'j'};
    char target = 'k';

    char ans = nextGreatestLetter(ch, target);
    System.out.println(ans);
  }

  public static char nextGreatestLetter(char[] letters, char target) {
    int start=0, end=letters.length-1;

    while( start <= end){
      int mid = (start+end)/2;
      if(target >= letters[mid]){
        start = mid+1;
      }
      else{
        end = mid-1;
      }
    }
    return letters[start % letters.length];
}

}
