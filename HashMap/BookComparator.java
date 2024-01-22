package HashMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
class Book{
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

  @Override
  public String toString(){
    return String.format("Book name= %s, Author=%s",name,author);
  }
}
public class BookComparator {
 public static void main(String[] args) {
  
  Comparator<Book> bookComparator = new Comparator<Book>() {
    
    public int compare(Book b1,Book b2){
      return b1.getName().toLowerCase().compareTo(b2.getName().toLowerCase());
    }
  };
  SortedMap<Book,Double> treeMap = new TreeMap<>(bookComparator);

  treeMap.put(new Book("Catcher in the Ray","J.D.Salinger"),3.3);
  treeMap.put(new Book("catcher in the Ray","J.D.Salinger"),9.8);
  treeMap.put(new Book("Ray","Salinger"),3.3);

  for(Entry<Book,Double> m:treeMap.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
  }
 } 
}
