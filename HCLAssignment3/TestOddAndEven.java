package HCLAssignment3;

import java.util.Scanner;

class OddAndEven {
  private int countOfOdd;
  private int countOfEven;

  public void addNumber(int n){
    if((n&1) == 1){
      countOfOdd++;
    }
    else{
      countOfEven++;
    }
  }

  public String toString(){
    return "Number of Odd: "+countOfOdd+", Number of Even:"+countOfEven;
  }
}

public class TestOddAndEven{
  public static void main(String[] args) {
    OddAndEven obj = new OddAndEven();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers: or enter Q or q to exit");
    String name = "";
    while(sc.hasNextLine()){
      name = sc.nextLine();
      if(name.equals("Q") || name.equals("q")){
        break;
      }
      else{
        try{
          int n = Integer.parseInt(name);
          obj.addNumber(n);
        }
        catch(NumberFormatException e){
          System.out.println("Invalidinput. please enter a number or 'Q' or q to exit.");
        }
      }
    }
    System.out.println(obj);
  }
}