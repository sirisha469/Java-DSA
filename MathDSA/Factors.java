package MathDSA;

import java.util.ArrayList;

public class Factors {
  public static void main(String[] args) {
    int n = 20;
    // factors1(n);
    // factors2(n);
    factors3(n);
  }

  //O(n)
  public static void factors1(int n){
    for(int i=1;i<=n;i++){
      if(n % i == 0){
        System.out.print(i+" ");
      }
    }
  }

  //O(sqrt(n))
  public static void factors2(int n){
    for(int i=1;i*i<=n;i++){
      if(n % i == 0){
        if(n/i == i){
          System.out.print(i+" ");
        }
        else{
          System.out.print(i+" "+n/i+" ");
        }
      }
    }
  }

  //space and time complexity O(sqrt(n))
  //Sorting the result in ascending order
  public static void factors3(int n){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=1;i*i<=n;i++){
      if(n % i == 0){
        if(n/i == i){
          System.out.print(i+" ");
        }
        else{
          System.out.print(i+" ");
          list.add(n/i);
        }
      }
    }

    for(int i=list.size()-1;i>=0;i--){
      System.out.print(list.get(i)+" ");
    }
  }
}
