package HashSet;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product>{
  String name;
  String category;
  Product(String name,String category){
    this.name = name;
    this.category = category;
  }

  @Override
  public String toString(){
    return "\n{name = "+name+" , category = "+category+"}";
  }

  @Override
  public boolean equals(Object other){
    if(other==null)
      return false;

    if(!(other instanceof Product)){
      return false;
    }

    Product otheProduct = (Product)other;

    if(otheProduct.name.equals(this.name) && otheProduct.category.equals(this.category)){
      return true;
    }

    return false;
  }

  @Override
  public int hashCode(){
    return Objects.hash(name,category);
  }

  @Override
  public int compareTo(Product o){
    int productCompare = o.name.compareTo(this.name);

    if(productCompare !=0){
      return productCompare;
    }

    return o.category.compareTo(this.category);
  }
}
public class ComparableTreeSet {
  public static void main(String[] args) {
    Set<Product> set = new TreeSet<>();
    Product phone = new Product("iphone", "Electronics");
    Product samsung = new Product("Samsung", "Electronics");
    Product jeans = new Product("Levis", "Apparel");
    set.add(phone);
    set.add(samsung);
    set.add(jeans);

    for(Product p:set)
      System.out.println(p);
  }
}


