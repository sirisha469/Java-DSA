package Stack;
import java.util.*;

public class StackExample {
  public static void main(String[] args) {
    // Stack st = new Stack();
    Stack<Integer> stack = new Stack<Integer>();

    stack_Push(stack);
    stack_Pop(stack);
    stack_Peek(stack);
    stack_search(stack, 9);

    printing(stack);

  }

  //push
  public static void stack_Push(Stack<Integer> st){
    for(int i=1; i<11; i++){
      st.push(i);
    }
    System.out.println("Push operation:"+st);
  }

  //pop
  public static void stack_Pop(Stack<Integer> st){
    System.out.println("After pop operation:"+st.pop());
    System.out.println(st);
  }

  //peek
  public static void stack_Peek(Stack<Integer> st){
    System.out.println("After peek operation:"+st.peek());
    System.out.println(st);
  }

  public static void stack_search(Stack<Integer> st, int element){
    Integer pos = st.search(element);

    if(pos == -1){
      System.out.println("Element not found");
    }
    else{
      System.out.println(element+" found at:"+pos);
    }
  }

  //printing all elements
  public static void printing(Stack<Integer> st){
    for(int i=0; i< st.size(); i++){
      System.out.println(i+"-->"+st.get(i));
    }
  }
}
