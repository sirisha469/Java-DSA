package BinarySearch;
//https://leetcode.com/problems/number-of-flowers-in-full-bloom/description/?envType=daily-question&envId=2023-10-11
import java.util.Arrays;

public class NumberOfFlowers {
  public static void main(String[] args) {
    int[][] flowers = {{1,6},{3,7},{9,12},{4,13}};
    int[] people = {2,3,7,11};

    int[] ans = fullBloomFlowers(flowers, people);
    System.out.println(Arrays.toString(ans));
  }
  public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
     int n = flowers.length;
        int [] start = new int[n];
        int [] end = new int[n];
        for(int i = 0;i< n;i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1]+1;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int [] ans = new int[people.length];
        int e ;
        int s ;
        for(int i = 0;i<people.length;i++){
            e = binarySearch(end, people[i]);
            s = binarySearch(start, people[i]);
            ans[i] = s-e;
        }
        return ans;
    }
    
    public static int binarySearch(int [] A, int target){
        int l = 0;
        int r = A.length;
        int mid;
        while(l<r){
            mid = (l+r)/2;
            if(target<A[mid])r = mid;
            else l = mid +1;
        }
        return l;
    }
}
