https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealthLeet {

  public static void main(String[] args) {
    int[][] arr= { {1, 2, 3}, {3, 2, 1}};
    int ans=maximumWealth(arr);
    System.out.println("Highest welth: "+ans);
  }
  
  public static int maximumWealth(int[][] accounts) {
    int max=0;
    for(int i=0;i<accounts.length;i++){
        int count=0;
        for(int j=0;j<accounts[i].length;j++){
            count += accounts[i][j];
        }
        if(count > max){
            max=count;
        }
    }
    return max;
}
}
