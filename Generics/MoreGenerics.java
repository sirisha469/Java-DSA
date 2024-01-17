package Generics;

public class MoreGenerics<T,S> {
  public T value1;
  public S value2;

  MoreGenerics(T value1,S value2){
    this.value1 = value1;
    this.value2 = value2;
  }

  public void setValue(T value1,S value2){
    this.value1 = value1;
    this.value2 = value2;
  }

  public T getValue1(){
    return value1;
  }

  public S getValue2(){
    return value2;
  }

  public String toString(){
    return "Value1: "+value1+" Value2: "+value2;
  }
  public static void main(String[] args) {

    
    MoreGenerics<String,String> s = new MoreGenerics<>("siri","naga");
    System.out.println(s);

    MoreGenerics<Integer,Integer> n = new MoreGenerics<>(10,20);
    System.out.println(n);

    MoreGenerics<Integer,String> both = new MoreGenerics<>(22,"naga");
    System.out.println(both);
  }
}
