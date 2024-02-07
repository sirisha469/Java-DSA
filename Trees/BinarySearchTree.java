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

  public void populateNew(int[] arr){
    for(int i=0;i<arr.length;i++){
      insert(arr[i]);
    }
  }
  
  private void insert(int data){
    root = insert(root,data);
  }

  private Node insert(Node node, int data){
    if(node == null){
      node = new Node(data);
      return node;
    }

    if(data<node.data){
      node.left = insert(node.left, data);
    }

    if(data > node.data){
      node.right = insert(node.right, data);
    }

    node.height = Math.max(height(node.left), height(node.right)+1);

    return node;
  }

  //Heigth of the node
  public int height(Node node){
    if(node == null)
      return -1;
    
    return node.height;
  }

  //Tree empty or not
  public boolean isEmpty(){
    return root == null;
  }


  //Display tree
  public void display(){
    display(root,"Root node: ");
  }

  private void display(Node node, String details){
    if(node == null){
      return;
    }

    System.out.println(details + node.getValue());

    display(node.left, "Left child of: "+node.getValue()+": ");
    display(node.right, "Right child of: "+node.getValue()+": ");
  }
}


class Main{
  public static void main(String[] args) {
    int[] arr = {5,2,7,1,4,6,9,8,3,10};
    BinarySearchTree btree = new BinarySearchTree();

    btree.populateNew(arr);
    btree.display();
  }
}
