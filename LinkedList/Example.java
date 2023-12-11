package LinkedList;

import java.util.LinkedList;

public class Example {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();

    names.push("Siri");//push at front
    names.add("Naga");//add at last or back
    names.push("Yashu");

    System.out.println(names);
    //peek
    System.out.println("Peek: "+names.peek());
    System.out.println("Peek First: "+names.peekFirst());
    System.out.println("Peek Last: "+names.peekLast());

    //pop
    System.out.println("Pop: "+names.pop());
    //isEmpty()
    System.out.println(names.isEmpty());

    String[] fruits = {"Orange","Grapes","pineapple","apple"};

    for(String s:fruits){
      names.push(s);
    }
    System.out.println(names);

    //remove
    System.out.println("Remove index 1: "+names.remove(1));
    System.out.println("Remove First: "+names.removeFirst());
    System.out.println("Remove Last: "+names.removeLast());

  }
}
