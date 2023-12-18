package Stack;

import java.util.Stack;

public class StackConcept {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    //push or add operation(both have same meaning)
    stack.push(1);
    stack.push(2);
    stack.add(3);

    System.out.println("Push operation: "+stack);


    //pop: It will delete the top character and also store the poped value in a variable
    stack.pop();
    int m = stack.pop();
    System.out.println("removed element: "+m);
    System.out.println("After pop operation: "+stack);

    //peek: It will show the top value
    System.out.println(stack.peek());

    //isEmpty()
    System.out.println("stack is empty: "+stack.isEmpty());


    //add at index
    stack.add(0,5);
    System.out.println(stack);

    
  }
}
