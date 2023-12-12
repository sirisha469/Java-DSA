package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Multi_Array_List {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();

    //initialisation
    for(int i=0;i<3;i++){
      list.add(new ArrayList<Integer>());
    }

    //add elements to the arraylist
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        list.get(i).add(sc.nextInt());
      }
    }

    System.out.println(list);
    System.out.println(list.get(0).get(1));

    sc.close();
  }
}
