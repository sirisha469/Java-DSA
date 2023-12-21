package HCLAssignment3;

import java.util.ArrayList;
import java.util.Scanner;

class Supplier{
  private int supplierId;
  private String supplierName;

  public Supplier(int supplierId,String supplierName){
    this.supplierId = supplierId;
    this.supplierName = supplierName;
  }

  public int getSupplierId(){
    return supplierId;
  }

  public String getSupplierName(){
    return supplierName;
  }

  public String toString(){
    return "["+supplierId+", "+supplierName+"]";
  }

}

class Product{
  private int productId;
  private String productName;
  private Supplier supplier;

  public Product(int productId,String productName, Supplier supplier){
    this.productId = productId;
    this.productName = productName;
    this.supplier = supplier;
  }

  public int getProductId(){
    return productId;
  }

  public String getProductName(){
    return productName;
  }

  public Supplier getSupplier(){
    return supplier;
  }

  public String toString(){
    return "["+productId+", "+", "+productName+", "+supplier+"]";
  }
}


public class ProductSupplier {
  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<>();

    Supplier s1 = new Supplier(1, "supplier 1");
    Supplier s2 = new Supplier(2, "supplier 2");
    Supplier s3 = new Supplier(3, "supplier 3");

    list.add(new Product(101,"product 1",s1));
    list.add(new Product(101,"product 1",s2));
    list.add(new Product(102,"product 2",s2));
    list.add(new Product(102,"product 2",s3));
    list.add(new Product(103,"product 3",s1));
    list.add(new Product(103,"product 3",s2));

    // System.out.println(list);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter product Id: ");
    int productId = sc.nextInt();

    findSuppliersBasedOnProductId(list,productId);

    System.out.println("Enter supplier id: ");
    int supplierId = sc.nextInt();

    findProductBasedOnSupplierId(list,supplierId);
  }

  private static void findSuppliersBasedOnProductId(ArrayList<Product> list, int productId) {
    int count =1;
    for(Product p:list){
      if(p.getProductId() == productId){
        System.out.println("-----Supplier "+count+" Details-----");
        System.out.println("Supplier id: "+p.getSupplier().getSupplierId());
        System.out.println("Supplier Name:"+p.getSupplier().getSupplierName());
        count++;
      }
    }
    System.out.println("Number of suppliers supplying prodcut: "+ (count-1));
  }

  private static void findProductBasedOnSupplierId(ArrayList<Product> list, int supplierId) {
    int count = 1;
    for(Product p:list){
      if(p.getSupplier().getSupplierId() == supplierId){
        System.out.println("-----Product "+count+" Details-----");
        System.out.println("Product Id: "+p.getProductId());
        System.out.println("Product Name: "+p.getProductName());
        count++;
      }
    }
    System.out.println("Number of products supplied by supplier "+supplierId+" is "+(count-1));
  }
}
