import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    System.out.println(list);
    list.add(20);
    list.add(30);

    //contains()
    System.out.println(list.contains(20));

    //set()
    list.set(0,100);

    //remove
    list.remove(1);

    System.out.println(list);

    ArrayList<Integer> list1=new ArrayList<>();
    //input
    for(int i=0;i<5;i++){
      list1.add(sc.nextInt());
    }

    for(int i=0;i<5;i++){
      System.out.println(list1.get(i));
    }

    sc.close();
  }
  
}
