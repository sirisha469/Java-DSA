// package Trees;

// import java.util.Scanner;

// public class BinaryTree {
//   public BinaryTree(){

//   }

//   private static class Node{
//     int val;
//     Node left;
//     Node right;

//     Node(int val){
//       this.val = val;
//     }
//   }

//   private Node root;

//   //Insert element
//   //root
//   public void populate(Scanner sc){
//     System.out.println("Enter the root node: ");
//     int value = sc.nextInt();
//     root = new Node(value);
//     populate(sc,root);
//     sc.close();
//   }

//   private void populate(Scanner sc, Node node){
//     System.out.println("Do you want to enter the left of "+node.val);
//     boolean left = sc.nextBoolean();
//     if(left){
//       System.out.println("Enter the value of the left of "+node.val);
//       int value = sc.nextInt();
//       node.left = new Node(value);
//       populate(sc, node.left);
//     }

//     System.out.println("Do you want to enter the right of "+node.val);
//     boolean right = sc.nextBoolean();
//     if(right){
//       System.out.println("Enter the value of the right of "+node.val);
//       int value = sc.nextInt();
//       node.right = new Node(value);
//       populate(sc, node.right);
//     }
//   }

//   //Display
//   public void display(){
//     display(root, "");
//   }

//   public void display(Node node, String indent){
//     if(node == null)
//       return;
    
//     System.out.println(indent + node.val);
//     display(node.left, indent + "\t");
//     display(node.right, indent + "\t");

//   }

//   //pretty display
//   public void prettyDisplay(){
//     prettyDisplay(root,0);
//   }

//   public void prettyDisplay(Node node,int level){
//     if(node==null)
//       return;

//     prettyDisplay(node.right, level + 1);

//     if(level != 0){
//       for(int i=0;i<level-1;i++){
//         System.out.print("|\t\t");
//       }
//       System.out.println("|---------->"+node.val);
//     }
//     else{
//       System.out.println(node.val);
//     }

//     prettyDisplay(node.left, level+1);
//   }
// }

// class Main{
//   public static void main(String[] args) {
//     BinaryTree b = new BinaryTree();
//     b.populate(new Scanner(System.in));
//     // b.display();
//     b.prettyDisplay();
//   }
// }