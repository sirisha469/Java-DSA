//https://leetcode.com/problems/flipping-an-image/
package Bitwise_Operations;

import java.util.Arrays;

//reverse the array and convert 1 to 0, 0 to 1
public class FlippingImage {
  public static void main(String[] args) {
    int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

    int[][] ans = flipAndInvertImage(image);

    for(int[] n:ans){
      System.out.println(Arrays.toString(n));
    }
  }

  public static int[][] flipAndInvertImage(int[][] image) {
        
    for(int i=0;i<image.length;i++){
        for(int j=0;j<(image[0].length+1)/2;j++){
            int temp = image[i][j] ^ 1;
            image[i][j] = image[i][image[0].length-j-1] ^ 1;
            image[i][image[0].length-j-1] = temp;
        }
    }
    return image;

}

}
