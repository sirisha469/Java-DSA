package HashSet;

import java.util.HashSet;
import java.util.Objects;

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
class HashSetEx {
  public static void main(String[] args) {
    HashSet<Product> set = new HashSet<>();
    Product phone = new Product("iphone", "Electronics");
    Product samsung = new Product("Samsung", "Electronics");
    set.add(phone);
    set.add(samsung);

    Product anotherPhone = new Product("iphone", "Electronics");
    set.add(anotherPhone);

    System.out.println(set);
  }
}
