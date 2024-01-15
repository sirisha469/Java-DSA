package Generics;

class Repository<T>{
  public T value;

  Repository(T value){
    this.value = value;
  }

  public void setValue(T value){
    this.value = value;
  }

  public T getValue(){
    return value;
  }

  public String toString(){
    return "value: "+value+"";
  }
}
public class MoreGenerics {
  
}
