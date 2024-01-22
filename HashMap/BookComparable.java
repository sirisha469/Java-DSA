package HashMap;

import java.util.Map.Entry;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

class Book implements Comparable<Book>{
  String name;
  String author;

  Book(String name,String author){
    this.name = name;
    this.author = author;
  }

  public String getName(){
    return name;
  }

  public String getAuthor(){
    return author;
  }

  public String toString(){
    return String.format("Book name= %s, Author=%s",name,author);
  }

  public boolean equals(Object other){
    if(other==null){
      return false;
    }

    if(!(other instanceof Book))
      return false;
    Book b= (Book)other;

    if(this.name.equals(b.name) && this.author.equals(b.author)){
      return true;
    }
    return false;
  }

  @Override
  public int hashCode(){
    return Objects.hash(name,author);
  }
  @Override
  public int compareTo(Book b){
    return b.getName().compareTo(this.name);
  }
}
class BookComparable {
  public static void main(String[] args) {
    SortedMap<Book,Double> treeMap = new TreeMap<>();

    treeMap.put(new Book("Catcher in the Ray","J.D.Salinger"),3.3);
    treeMap.put(new Book("catcher in the Ray","J.D.Salinger"),9.8);
    treeMap.put(new Book("Ray","Salinger"),3.3);

    for(Entry<Book,Double> m:treeMap.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }
  }
}
