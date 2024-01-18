package HashSet;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Product{
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

}
public class ComparatorTreeSet1 {
  public static void main(String[] args) {
    
    Comparator<Product> productComparator = new Comparator<>(){

      @Override
      public int compare(Product o1, Product o2) {
        int compareName = o1.name.compareTo(o2.name);

        if(compareName != 0){
          return compareName;
        }

        return o1.category.compareTo(o2.category);
      }

    };
    Set<Product> set = new TreeSet<>(productComparator);
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
