package Trees;

public class BinarySearchTree {
  
  class Node{
    int data;
    int height;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
    }

    public int getValue(){
      return data;
    }
  }

  private Node root;
  
}
