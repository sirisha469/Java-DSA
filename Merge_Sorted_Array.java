import java.util.Arrays;
import java.util.Scanner;
// import java.lang.*;
public class Merge_Sorted_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter");
        // int m = sc.nextInt();
        // sc.next();
        // String[] str1 = sc.nextLine().split(" ");
        // //String[] str= nums1.split(" ");
        // int[] arr1= new int[str1.length];
        // int n = sc.nextInt();
        // sc.next();
        // String[] str2 = sc.nextLine().split(" ");
        // //String[] str= nums1.split(" ");
        // int[] arr2= new int[str2.length];
        // for(int i=0; i<arr1.length;i++){
        //     arr1[i]=Integer.valueOf(str1[i]);
        // }
        // for(int i=0; i<arr2.length;i++){
        //     arr2[i]=Integer.valueOf(str2[i]);
        // }

        int m=3;
        int n=3;
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};

        merge(arr1,m,arr2,n);

        sc.close();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m;
        for(int i=0;i<n;i++){
            nums1[k] = nums2[i];
            k++;
        }
        
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
