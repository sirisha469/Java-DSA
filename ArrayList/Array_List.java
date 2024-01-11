package ArrayList;
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

    //add at index: it move the value to next index 
    list.add(0,500);
    list.add(0,600);
    System.out.println(list);

    //set(): Here it will replace the value at index 
    list.set(0,100);
    System.out.println(list);

    //remove: remove value at index
    list.remove(1);
    //remove the value directly
    list.remove(Integer.valueOf(20));
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
